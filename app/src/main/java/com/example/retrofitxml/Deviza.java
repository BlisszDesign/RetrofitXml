package com.example.retrofitxml;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.ArrayList;

@Root(name = "deviza", strict = false)
public class Deviza implements Serializable {
    @ElementList(name = "item", inline = true)
    private ArrayList<Item> mItems;

    public Deviza(){
    }

    public Deviza(ArrayList<Item> mItems){
        this.mItems = mItems;
    }

    public ArrayList<Item> getmItems() {
        return mItems;
    }

    public void setmItems(ArrayList<Item> mItems) {
        this.mItems = mItems;
    }

}
