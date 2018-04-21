package com.merav.testing.infra;

import java.util.Date;

public class Request {

    private String baseURL;
    private String apiCall;
    private String date;
    
    private Request (RequestBuilder builder){
        this.baseURL = builder.baseURL;
        this.apiCall = builder.apiCall;
        this.date = builder.date;

    }

    public String toString(){
        StringBuilder url = new StringBuilder();
       /* https://wapi.theneura.com/v1/
       users/profile/daily_summary/extended
       ?
       date
       =
       2018-04-20

        */

        url.append(baseURL);
        url.append(apiCall);
        url.append("?date=");
        url.append(date);
        return url.toString();

    }
    public static class RequestBuilder{

        private String type;
        private String baseURL;
        private String apiCall;
        private String date;

        public RequestBuilder setBaseURLEnabled(String baseURL){
            this.baseURL = baseURL;
            return this;
        }
        public RequestBuilder setAPICallEnabled(String apiCall){
            this.apiCall = apiCall;
            return this;
        }
        public RequestBuilder setDateEnabled(String date){
            this.date = date;
            return this;
        }

        public Request build(){
            return new Request(this);
        }
    }
}
