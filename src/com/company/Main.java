package com.company;

public class Main {

    public static void main(String[] args) {
	Age a=new Age();
	a.setDay(05);
	a.setMonth(10);
	a.setYear(1993);

	ImmutableClass immutable=new ImmutableClass("aswarth",a);
		System.out.println(immutable.getAge().getYear());
		a.setYear(1995);
		System.out.println(immutable.getAge().getYear());
    }
}
