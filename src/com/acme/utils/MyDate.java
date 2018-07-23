package com.acme.utils;

import sun.reflect.generics.scope.MethodScope;

public class MyDate {

    private int day;
    private int year;
    private int month;

// same name as the class and no return type
    // No argument constructor
    public MyDate() {
        this(1,1,1900);

    }

    // constructor that takes three arguments
    public MyDate(int m, int d, int y) {
        // use the parameters m,d, and y to set three attributes
        setDate(m, d, y);

    }
    // Methods
    public String toString() {
        return month + "/" + day + "/ " + year;
    }

    public void setDate(int m, int d, int y) {
       if(valid(m,d,y)){
           day = (byte)d;
           year =(short)y;
           month=(byte)m;
       }

    }
    public static void leapYears() {
        for (int i = 1752; i <= 2020; i = i + 4) {
            if ((i % 100 != 0) || (i % 400 == 0))
                System.out.println("The year " + i + " is a leap year");
        }
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
       if(valid(day,month,year)){
           this.year= (short)year;
       }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
       if(valid(day,month,year)){
           this.month=(byte)month;
       }
    }

    public boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1) {
          System.out.println("Attempting to create non - valid date");

            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return day <= 30;
            case 2:
                return (day <= 28 || (day == 29 | year % 4 == 0));

        }
        return true;

    }


    }

