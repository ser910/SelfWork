package com.degtyar.sergey.selfwork;

/**
 * Created by student on 23.11.2016.
 */

public class PersonInfo {
    public String image_url;
    public String Name;
    public String Email;

    public PersonInfo(String image_url, String name, String email) {
        this.image_url = image_url;
        this.Name = name;
        this.Email = email;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
