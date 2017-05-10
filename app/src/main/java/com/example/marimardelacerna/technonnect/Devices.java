package com.example.marimardelacerna.technonnect;

/**
 * Created by ryan_boter on 5/11/2017.
 */

public class Devices {

    private int pic;
    private String name;

    public Devices(int pic, String name) {
        this.pic = pic;
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
