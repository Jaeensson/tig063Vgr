package com.example.tig063vgr;

public class MenuListItem {
    private int resId;
    private String text;
    private String phone;

    public MenuListItem(String txt, int res, String no) {
        resId = res;
        text = txt;
        phone = no;
    }
    public int getResId() {
        return resId;
    }
    public  String getText() {
        return text;
    }
    public  String getPhone() {
        return phone;
    }
}
