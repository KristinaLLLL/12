package com.company;

public class Person {
    private String s="";
    private String n="";
    private String p="";

    Person(String s, String n, String p){
        this.n=n;
        this.p=p;
        this.s=s;
    }

    public String returnSNP(){
        return s+" "+n+" "+p;
    }
}
