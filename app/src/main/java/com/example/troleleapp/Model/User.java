package com.example.troleleapp.Model;

public class User {
    private String id;
    private String username;
    private String imageURL;
    private String sex;
    private String phone;
    private String age;
    private String status;

    public User(String id, String username, String imageURL, String sex, String phone, String age, String status) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.sex = sex;
        this.phone = phone;
        this.age = age;
        this.status = status;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
