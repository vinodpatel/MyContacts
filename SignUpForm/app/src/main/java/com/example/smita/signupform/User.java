package com.example.smita.signupform;

import java.io.Serializable;

/**
 * Created by Smita on 17-Feb-2015.
 */
public class User implements Serializable{
    private String mUsername;
    private String mPassword;

    User(String mUsername, String mPassword){
        this.mUsername=mUsername;
        this.mPassword=mPassword;
    }

    public String getUsername(){
        return mUsername;
    }
}
