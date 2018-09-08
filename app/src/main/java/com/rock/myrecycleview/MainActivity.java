package com.rock.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.rock.myrecycleview.adapter.CommonRecycleViewAdapter;
import com.rock.myrecycleview.adapter.ViewHolderHelper;
import com.rock.myrecycleview.bean.PhotoBean;
import com.rock.myrecycleview.listener.OnItemClickListener;
import com.rock.myrecycleview.listener.OnLoadMoreListener;
import com.rock.myrecycleview.listener.OnRefreshListener;
import com.rock.myrecycleview.view.LoadMoreFooterView;
import com.rock.myrecycleview.view.MyRecycleView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements  OnLoadMoreListener, OnRefreshListener, OnItemClickListener {

    private TextView txt;
    private MyRecycleView recycleView;
    private CommonRecycleViewAdapter<PhotoBean.ResultsBean> adapter;
    private int page = 1;
    private List<PhotoBean.ResultsBean> resultsBeens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initrecycle();
        getDatas(page);
    }

    private void initrecycle() {
        resultsBeens = new ArrayList<PhotoBean.ResultsBean>();
        recycleView = (MyRecycleView) findViewById(R.id.main_list);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recycleView.setLayoutManager(manager);
        recycleView.setOnLoadMoreListener(this);
        recycleView.setOnRefreshListener(this);
        adapter = new CommonRecycleViewAdapter<PhotoBean.ResultsBean>(getBaseContext(),R.layout.recycleview_item_simple_image,resultsBeens) {
                                    @Override
                                    public int getItemCount() {
                                        return resultsBeens.size();
                                    }

                                    @Override
                                    public void convert(ViewHolderHelper helper, PhotoBean.ResultsBean resultsBean) {
                                        ImageView photoImg = helper.getView(R.id.simple_image);
                                        TextView title = helper.getView(R.id.simple_title);
                                        title.setText(resultsBean.getDesc());
                                        Glide.with(mContext).load(resultsBean.getUrl())
                                                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                                                .placeholder(R.drawable.ic_image_loading)
                                                .error(R.drawable.ic_empty_picture)
                                                .centerCrop().override(1090, 1090*3/4)
                                                .crossFade().into(photoImg);
                                    }

                                };
        recycleView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }

    private void getDatas(int p) {
        OkHttpUtils
                .get()
                .url("http://gank.io/api/data/福利/20/1")
                .addParams("page", String.valueOf(p))
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        try {
                            List<PhotoBean.ResultsBean>  resultsBeen = new ArrayList<PhotoBean.ResultsBean>();
                            JSONObject object = new JSONObject(response);
                            JSONArray jsonArray = object.optJSONArray("results");
                            for (int i = 0 ;i< jsonArray.length(); i++){
                                JSONObject o = jsonArray .optJSONObject(i);
                                PhotoBean.ResultsBean bean= new PhotoBean.ResultsBean();
                                bean.setDesc(o.optString("desc"));
                                bean.setUrl(o.optString("url"));
                                resultsBeen.add(bean);
                            }
                            if (resultsBeen != null){
                                resultsBeens.addAll(resultsBeen);
                                page += 1;
                                if (adapter.getPageBean().isRefresh()){
                                    recycleView.setRefreshing(false);
                                }else {
                                    if (resultsBeens.size() > 0){
                                        recycleView.setLoadMoreStatus(LoadMoreFooterView.Status.GONE);
                                        adapter.addAll(resultsBeens);

                                    }else {
                                        recycleView.setLoadMoreStatus(LoadMoreFooterView.Status.THE_END);
                                    }
                                }

                            }
                            adapter.notifyDataSetChanged();


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }


    @Override
    public void onRefresh() {
        adapter.getPageBean().setRefresh(true);
        page = 0;
        recycleView.setRefreshing(true);
        getDatas(page);
    }

    @Override
    public void onLoadMore(View loadMoreView) {
        adapter.getPageBean().setRefresh(false);
        recycleView.setLoadMoreStatus(LoadMoreFooterView.Status.LOADING);
        getDatas(page);
    }

    @Override
    public void onItemClick(ViewGroup parent, View view, Object o, int position) {
        Toast.makeText(this,position+"被点击了",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onItemLongClick(ViewGroup parent, View view, Object o, int position) {
        Toast.makeText(this,position+"被长按了",Toast.LENGTH_LONG).show();
        return false;
    }
}
