package com.allattentionhere.autoplayvideossample.Model;

/**
 * Created by krupenghetiya on 03/02/17.
 */

public class MyModel {

    private String data_url;
    private String name;
    private int data_type;


    public String getData_url() {
        return data_url;
    }

    public void setData_url(String data_url) {
        this.data_url = data_url;
    }

    public int getData_type() {
        return data_type;
    }

    public void setData_type(int data_type) {
        this.data_type = data_type;
    }

    public MyModel(String data_url, String name, int data_type) {
       this.data_url = data_url;
        this.name = name;
        this.data_type = data_type;

    }

    public String getName() {
        return name;
    }
}
