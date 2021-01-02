package com.example.whats_app_ieee2;

public class Chats_Calls_details {

  private String name ;
    private int id ;

    public Chats_Calls_details(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
