package com.example.myapplication;

public class item {
    String name;
    String email;
    int image;
    String text;
    String link;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public item(String name, String email, int image , String text){
        this.email=email;
        this.image=image;
        this.name=name;
        this.text = text;
        this.link =link;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getLink() {
        return link;
    }
}
