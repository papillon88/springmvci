package com.papillon.dc.dao;

import com.papillon.dc.validators.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by papillon on 5/16/2017.
 */
public class Offer {

    private int id;
    @Size(min = 5,max = 100,message = "name should be between 5 and 100 chars")
    private String name;
    @NotNull
    //@Pattern(regexp = ".*\\@.*\\..*",message = "invalid email")
    @ValidEmail(min = 6)
    private String email;
    @Size(min = 20,max = 255,message = "text between 20 and 255 chars")
    private String text;

    public Offer(){}

    public Offer(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public Offer(int id, String name, String email, String text) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
