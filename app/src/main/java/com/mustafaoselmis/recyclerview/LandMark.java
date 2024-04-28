package com.mustafaoselmis.recyclerview;

import java.io.Serializable;

public class LandMark implements Serializable {



    String name;
    String country;
    int image; // Fotoğraflar int olarak kaydedilir.

    //constructor
    public LandMark(String name,String country,int image) {
        this.name = name;
        this.country = name;
        this.image = image;
    }
}
