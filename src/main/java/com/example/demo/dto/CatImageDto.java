package com.example.demo.dto;

public class CatImageDto {

    private String id;
    private String url;
    private int width;
    private int height;

    public void setId(String id) {
        this.id = id;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
