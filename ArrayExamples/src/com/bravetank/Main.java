package com.bravetank;

import java.util.Arrays;
import java.util.Comparator;


public abstract class Main {

    public static void main(String[] args) {

        //Creating an Array (1)
        String[] family = new String[3];
        family[0] = "Michelle";
        family[1] = "Peter";
        family[2] = "Deks";
        System.out.println(family[0]);
        System.out.println(family[1]);
        System.out.println(family[2]);


        //Creating an Array (2)
        int[] marks = {88, 99, 74};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //Enhanced for loop
        String[] food = {"pancakes", "waffles", "scones"};
        for (String item : food) {
            System.out.println("I love " + item);
        }

        //Unenhanced (original) for loop
        int[] dates = {1970, 1972, 1973};
        for (int i = 0; i < dates.length; i++)
            System.out.println("The date is " + dates[i]);


        String[] programmers = {
                "Yukihiro Matsumoto",
                "David Nolen",
                "Grace Hopper",
                "Linus Torvalds",
                "You"
        };

        System.out.println("Choose a programmer:");

        for (int i = 0; i < programmers.length; i++) {
            System.out.println((i + 1) + "." + programmers[i]);
        }

        //Multi Dimensional/ 2D Array

        String[] person = {"Sidney", "Judy", "Lulu"};

        int[][] scorecards = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7}
        };

        System.out.println("Printing first row: " +
                Arrays.toString(scorecards[0]));
        System.out.println("Printing second row third score: " + scorecards[1][2]);

        //for each person
        // print their name
        //for each scorecard row
        //print their score

        for (int i = 0; i < person.length; i++) {
            System.out.printf("%n%s%n------------------%n", person[i]);
            System.out.printf("%s %n", Arrays.toString(scorecards[i]));
        }

        //or

        for (int i = 0; i < person.length; i++) {
            System.out.printf("%n%s%n------------------%n", person[i]);
            for (int j = 0; j < scorecards[i].length; j++) {
                System.out.printf("Hole #%d: %d %n", j + 1, scorecards[i][j]);
            }
        }

        //Copying an Array into a bigger Array
        String[] morePeople = new String[4];
        System.arraycopy(person, 0, morePeople, 0, person.length);
        System.out.println(Arrays.toString(morePeople));

        //Alternative way of copying using the Arrays library that has been imported
        String[] morePeople2 = Arrays.copyOf(person, person.length + 1);
        System.out.println(Arrays.toString(morePeople2));

        //Sorting (in place i.e.modifies the original array, does not create a copy)
        String[] idols = {
                "Paul",
                "John",
                "Ringo",
                "George"
        };

        Arrays.sort(idols);
        System.out.println(Arrays.toString(idols));

        //Sorting using a different comparator - need to import comparator

        String[] singers = {
                "Barbra",
                "Liza",
                "Adele",
                "Crazylongname"
        };

        //Calling the length method on each of the Strings & compare them
        Arrays.sort(singers, Comparator.comparing(String::length));

        System.out.println(Arrays.toString(singers));

        Arrays.sort(singers, Comparator.comparing(String::length).reversed());

        System.out.println(Arrays.toString(singers));

        //Splitting string into an array of chars
        char[] letters = "sunday".toCharArray();
        Arrays.sort(letters);
        System.out.println(letters[0]);


        //Varargs - allows the method to accept zero or multiple arguments
        pickChocolate("twix", "bounty", "mars", "crunchie");

    }

    //Varargs - cont
    public static void pickChocolate(String... chocolates) {
        for (String chocolate : chocolates) {
            System.out.printf("I love %s %n", chocolate);
        }
    }
}








