package com.company;

public class Main {

    public static void main(String[] args) {
	Person p1=new Person("Lopatina", "Kristina", "");
	System.out.println(p1.returnSNP());


	Address a1= new Address("Россия, Алтайский край, Бийск, Советская, 215, а, 47");
	System.out.println(a1.getCity());
    }
}
