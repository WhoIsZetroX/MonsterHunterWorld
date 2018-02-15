package com.example.proyectodani2;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by dam2a on 30/01/18.
 */

@IgnoreExtraProperties
public class Monster {
    String name;
    int imageUrl;
    String picUrl;

    public Monster(){}

    public Monster(/*String name,*/ int imageUrl) {
        /*this.name = name;*/
        this.imageUrl = imageUrl;
    }

    public Monster(String name, String picUrl){
        this.name = name;
        this.picUrl = picUrl;
    }
}
