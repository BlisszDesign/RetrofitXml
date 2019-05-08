package com.example.retrofitxml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "arfolyamok", strict = false)
public class Arfolyamok implements Serializable {

    @Element(name = "deviza")
    private Deviza mDeviza;

    public Arfolyamok(){
    }

    public Arfolyamok(Deviza mDeviza){
        this.mDeviza = mDeviza;
    }

    public Deviza getmDeviza() {
        return mDeviza;
    }

    public void setmDeviza(Deviza mDeviza) {
        this.mDeviza = mDeviza;
    }

}
