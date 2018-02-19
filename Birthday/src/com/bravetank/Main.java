package com.bravetank;

public class Main {

    public static void main(String[] args) {
	String birthday = "04/05/1972";
	String day = birthday.substring(0,2);
	String month = birthday.substring(3,5);
	String year = birthday.substring(6);
	System.out.printf("The day is %s, the month is %s, the year is %s",
                day, month, year);
    }
}
