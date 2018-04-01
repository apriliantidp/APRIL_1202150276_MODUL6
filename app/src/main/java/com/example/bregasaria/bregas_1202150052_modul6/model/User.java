package com.example.bregasaria.bregas_1202150052_modul6.model;

/**
 * Created by USER on 4/1/2018.
 */
import com.google.firebase.database.IgnoreExtraProperties;
@IgnoreExtraProperties

public class User {

    public String username;

    public String email;



    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }



    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}
