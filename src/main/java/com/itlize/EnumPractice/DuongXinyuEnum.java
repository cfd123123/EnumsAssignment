package com.itlize.EnumPractice;

public enum DuongXinyuEnum {
    Duong("Duong"),
    Xinyu("Xinyu");

    private final String name;

    private DuongXinyuEnum(String name){
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + this.name + "!";
    }

    public boolean isDuong(){
        return this.name.equals("Duong");
    }

    public boolean isXinyu(){
        return this.name.equals("Xinyu");
    }
}
