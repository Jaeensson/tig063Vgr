package com.example.tig063vgr;

public class MenuListItem {
    private int resId;
    private String text;
    public MenuListItem(String txt, int res) {
        resId = res;
        text = txt;
    }
    public int getResId() {
        return resId;
    }
    public  String getText() {
        return text;
    }
}
