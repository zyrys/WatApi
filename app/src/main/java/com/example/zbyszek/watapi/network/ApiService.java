package com.example.zbyszek.watapi.network;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

/**
 * Created by zbyszek on 17.09.15.
 */
public class ApiService extends RetrofitGsonSpiceService {

        private final static String BASE_URL = "http://bookweb.ciolek.info/api/v1/";

        @Override
        public void onCreate() {
            super.onCreate();
            addRetrofitInterface(Apiinterface.class);
        }

        @Override
        protected String getServerUrl() {
            return BASE_URL;
        }

}

