package com.mongodbspringdemo.springmongodbdemo.model;

import org.springframework.data.annotation.Id;

public class Post {

    @Id
    private String id;
    private String post;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
