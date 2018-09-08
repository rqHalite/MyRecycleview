package com.rock.myrecycleview.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Rock on 2018/6/29.
 */

public class PhotoBean implements Serializable {


    /**
     * error : false
     * results : [{"_id":"5b33ccf2421aa95570db5478","createdAt":"2018-06-28T01:44:18.488Z","desc":"2018-06-28","publishedAt":"2018-06-28T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsq9iq8ttrj30k80q9wi4.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b32807e421aa95570db5471","createdAt":"2018-06-27T02:05:50.227Z","desc":"2018-06-27","publishedAt":"2018-06-27T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsp4iok6o4j30j60optbl.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b31aa33421aa9556d2cc4a7","createdAt":"2018-06-26T10:51:31.60Z","desc":"2018-06-26","publishedAt":"2018-06-26T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsoe3k2gkkj30g50niwla.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b2f8847421aa9556b44c666","createdAt":"2018-06-24T20:02:15.413Z","desc":"2018-06-24","publishedAt":"2018-06-25T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsmis4zbe7j30sg16fq9o.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b0d6ac0421aa97efda86560","createdAt":"2018-05-29T22:59:12.622Z","desc":"2018-06-02","publishedAt":"2018-06-22T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1frslruxdr1j30j60ok79c.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b27c7aa421aa923c0fbfda0","createdAt":"2018-06-18T22:54:34.199Z","desc":"2018-06-19","publishedAt":"2018-06-21T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsfq1k9cb5j30sg0y7q61.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b27c7bf421aa923c0fbfda1","createdAt":"2018-06-18T22:54:55.614Z","desc":"2018-06-20","publishedAt":"2018-06-20T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsfq1ykabxj30k00pracv.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b27c7eb421aa923c43fe485","createdAt":"2018-06-18T22:55:39.819Z","desc":"2018-06-22","publishedAt":"2018-06-19T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsfq2pwt72j30qo0yg78u.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b2269a6421aa92a5f2a35f9","createdAt":"2018-06-14T21:12:06.463Z","desc":"2018-06-15","publishedAt":"2018-06-15T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fsb0lh7vl0j30go0ligni.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b1fec10421aa9793930bf99","createdAt":"2018-06-12T23:51:44.815Z","desc":"2018-06-13","publishedAt":"2018-06-14T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs8tym1e8ej30j60ouwhz.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b1fec9f421aa9793930bf9a","createdAt":"2018-06-12T23:54:07.908Z","desc":"2018-06-14","publishedAt":"2018-06-13T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs8u1joq6fj30j60orwin.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b1e8164421aa910a82cf54f","createdAt":"2018-06-11T22:04:20.9Z","desc":"2018-06-12","publishedAt":"2018-06-12T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs7l8ijitfj30jg0shdkc.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b196deb421aa910ab3d6b3d","createdAt":"2018-06-08T01:39:55.555Z","desc":"2018-06-09","publishedAt":"2018-06-11T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs35026dloj30j60ov79x.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b196d0b421aa910ab3d6b3c","createdAt":"2018-06-08T01:36:11.740Z","desc":"2018-06-08","publishedAt":"2018-06-08T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs34w0jx9jj30j60ootcn.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b17fec9421aa9109f56a6bb","createdAt":"2018-06-06T23:33:29.429Z","desc":"2018-06-07","publishedAt":"2018-06-07T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs1vq7vlsoj30k80q2ae5.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b1026a0421aa9029661ae00","createdAt":"2018-06-01T00:45:20.83Z","desc":"2018-06-01","publishedAt":"2018-06-06T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1frv032vod8j30k80q6gsz.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b15ec20421aa97e45f15aae","createdAt":"2018-06-05T09:49:20.355Z","desc":"2018-06-05","publishedAt":"2018-06-05T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fs02a9b0nvj30sg10vk4z.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b14aaa9421aa93df569c6f1","createdAt":"2018-06-04T10:57:45.583Z","desc":"2018-06-04","publishedAt":"2018-06-04T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1fryyn63fm1j30sg0yagt2.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b1026ba421aa9029895ba44","createdAt":"2018-06-01T00:45:46.820Z","desc":"2018-06-02","publishedAt":"2018-06-01T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1frv03m8ky5j30iz0rltfp.jpg","used":true,"who":"lijinshanmx"},{"_id":"5b0d6946421aa97f0308836b","createdAt":"2018-05-29T22:52:54.29Z","desc":"2018-05-31","publishedAt":"2018-05-31T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1frsllc19gfj30k80tfah5.jpg","used":true,"who":"lijinshanmx"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5b33ccf2421aa95570db5478
         * createdAt : 2018-06-28T01:44:18.488Z
         * desc : 2018-06-28
         * publishedAt : 2018-06-28T00:00:00.0Z
         * source : web
         * type : 福利
         * url : http://ww1.sinaimg.cn/large/0065oQSqly1fsq9iq8ttrj30k80q9wi4.jpg
         * used : true
         * who : lijinshanmx
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
