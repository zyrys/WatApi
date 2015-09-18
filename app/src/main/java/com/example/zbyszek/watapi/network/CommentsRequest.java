package com.example.zbyszek.watapi.network;

import com.example.zbyszek.watapi.models.Comment;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

/**
 * Created by zbyszek on 17.09.15.
 */
public class CommentsRequest extends RetrofitSpiceRequest<Comment.List, Apiinterface> {


    public CommentsRequest() {
        super(Comment.List.class, Apiinterface.class);
    }

    @Override
    public Comment.List loadDataFromNetwork() throws Exception {
        return getService().comments();
    }
}
