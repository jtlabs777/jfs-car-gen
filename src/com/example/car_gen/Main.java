package com.example.car_gen;

public class Main {

    public static void main(String[] args) {
        Honda civic = new Honda("red", 2006, 120, false, true);
        Lexus rx350 = new Lexus("white", 2015, 120, false, true);
        Toyota supra = new Toyota("black", 2021, 140, false, true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());


    }
}
