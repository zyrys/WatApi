package com.example.zbyszek.watapi.network;

import com.example.zbyszek.watapi.models.Comment;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by zbyszek on 17.09.15.
 */
public interface Apiinterface {
    @GET("/comments")
    Comment.List comments();
}



