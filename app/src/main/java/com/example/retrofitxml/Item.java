package com.example.retrofitxml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Root(name = "item", strict = false)
public class Item implements Serializable {

    @Element(name = "bank")
    private String mBank;

    @Element(name = "datum")
    private String mDatum;

    @Element(name = "penznem")
    private String mPenznem;


   /* @Element(name = "vetel")
    private String mVetel;

    @Element(name = "eladas")
    private String mEladas;*/

    @Element(name = "kozep", required = false)
    private String mKozep;

    public Item(){
    }

    public Item(String mBank, String mDatum, String mPenznem, String mKozep){
        this.mBank = mBank;
        this.mDatum = mDatum;
        this.mPenznem = mPenznem;

    this.mKozep = mKozep;
    }

    public String getmBank() {
        return mBank;
    }

    public void setmBank(String mBank) {
        this.mBank = mBank;
    }

    public String getmDatum() {
        return mDatum;
    }

    public void setmDatum(String mDatum) {
        this.mDatum = mDatum;
    }

    public String getmPenznem() {
        return mPenznem;
    }

    public void setmPenznem(String mPenznem) {
        this.mPenznem = mPenznem;
    }

    public String getmKozep() {
        return mKozep;
    }

    public void setmKozep(String mKozep) {
        this.mKozep = mKozep;
    }


}
