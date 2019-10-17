package com.example.android.miwok;

public class Numbers {
    private String DefTrans;
    private String MiwokTrans;
    public Numbers (String defTrans,String miwokTrans){
        DefTrans=defTrans;
        MiwokTrans=miwokTrans;
    }
    public String getDefTrans(){
        return DefTrans;
    }
    public String getMiwokTrans(){
        return  MiwokTrans;
    }
}
