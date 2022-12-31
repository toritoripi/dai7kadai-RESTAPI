package com.example.dai7kadai.RESTAPI;

public class CreateForm {

    private String name;
    private String birthday;
    private String id;

    public CreateForm(String name, String birthday, String id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setId(String id) {
        this.id = id;
    }
}
