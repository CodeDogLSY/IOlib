package com.lib.lsy.sample.demo.entity;

import java.io.Serializable;
import java.util.List;

public class SortCityBean {

    private int code;
    private String msg;


    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean implements Serializable {
        /**
         * list : [{"id":"1","name":"United States"}]
         * name : U
         */

        private String name;
        private List<ListBean> list;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            /**
             * id : 1
             * name : United States
             */

            private String id;
            private String name;
            private String sortLetters;  //显示数据拼音的首字母
            private String code;
            private String jpushCode;

            public String getJpushCode() {
                return jpushCode;
            }

            public void setJpushCode(String jpushCode) {
                this.jpushCode = jpushCode;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getSortLetters() {
                return sortLetters;
            }

            public void setSortLetters(String sortLetters) {
                this.sortLetters = sortLetters;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
