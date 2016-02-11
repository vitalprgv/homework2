package com.company;

/**
 * Created by Виталий on 23.01.2016.
 */
public class Dog {
    public String name = "";
    public String says = "";

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}
