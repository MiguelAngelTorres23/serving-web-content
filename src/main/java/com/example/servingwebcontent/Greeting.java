package com.example.servingwebcontent;

/**
 * com.example.servingwebcontent
 * Nombre_project: serving-web-content
 * Greeting
 * Created by: magua
 * Date : 20/04/2021
 * Description:
 **/
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

