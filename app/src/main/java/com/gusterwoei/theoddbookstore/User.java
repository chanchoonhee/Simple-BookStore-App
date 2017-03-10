package com.gusterwoei.theoddbookstore;

import android.content.Intent;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by user on 08-Mar-17.
 */

public class User {
    private String username;
    private String password;
    private String lastname;
    private String firstname;



    public static final String md5(final String s) {

        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);

            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    public User(String userName, String passwd,String lName, String fName){
        username = userName;
        password = md5(passwd);
        lastname = lName;
        firstname = fName;
    }


    public Integer validateLogin(String userName, String passwd){

        if (userName == username && md5(passwd) == password){
            return 1;
        }
        else
            return 0;
    }






}
