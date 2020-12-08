package com.company;

public class Address {
    private String country="";
    private String district="";
    private String city="";
    private String street="";
    private String house="";
    private String building="";
    private String flat="";
   Address(String address){
        int i=0;
        while(i!=address.length()-1){
            int n=address.indexOf(',');
            this.country=address.substring(n);
            i=n;
            if (i==address.length()-1) break;
            n=address.indexOf(',', n);
            this.district=address.substring(n,i);
            i=n;
            if (i==address.length()-1) break;
            n=address.indexOf(',', n);
            this.city=address.substring(n,i);
            i=n;
            if (i==address.length()-1) break;
            n=address.indexOf(',', n);
            this.street=address.substring(n,i);
            i=n;
            if (i==address.length()-1) break;
            n=address.indexOf(',', n);
            this.house=address.substring(n,i);
            i=n;
            if (i==address.length()-1) break;
            n=address.indexOf(',', n);
            this.building=address.substring(n,i);
            i=n;
            if (i==address.length()-1) break;
            n=address.lastIndexOf(',');
            this.flat=address.substring(n,address.length()-1);
            break;
        }
        this.street.trim();
        this.country.trim();
        this.house.trim();
        this.district.trim();
        this.building.trim();
        this.flat.trim();
        this.city.trim();
    }
    String getCountry(){
        return this.country;
    }
    String getCity(){
        return this.city;
    }
}
