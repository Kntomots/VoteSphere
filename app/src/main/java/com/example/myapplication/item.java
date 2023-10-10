package com.example.myapplication;

public class item {
    String name;
    String email;
    String image;
    String text;
    String link;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public item(String name, String email, String image , String text ,String link){
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getLink() {
        return link;
    }
}
