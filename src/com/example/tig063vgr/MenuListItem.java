package com.example.tig063vgr;

public class MenuListItem {
    private int resId;
    private String text;
    private String phone;

    public MenuListItem(String txt, int res, String no) {
        //ResourceId för bilden som ska visas i listan
        resId = res;
        //Texten som ska visas
        text = txt;
        //Telefonummret som rings när man klickar i listan
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
