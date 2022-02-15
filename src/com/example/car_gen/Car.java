package com.example.car_gen;

public class Car {
    String color;
    int year;
    int speed = 0;
    int maxSpeed;
    boolean isElectric;

    public Car(String color, int year, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    /*getter methods*/

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getSpeed() {
        return this.speed;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }

     //Setter methods

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    /*Accelerated speed returns speed and increases speed by 5 mph*/

    public int acceleratedSpeed() {

        if (this.speed <= this.maxSpeed - 5) { //make sure it does not go above max
            this.speed += 5;

        } else {
            this.speed = this.maxSpeed;
        }
        return this.speed;

    }

    public int decelerateSpeed() {
        if (this.speed >= 5) {
            this.speed -= 5;
            return this.speed;
        } else {
            return 0;
        }
    }

    public boolean convertToElectric() {


        if (this.isElectric == true) {
            System.out.println("The car is already electric");
            return this.isElectric;
        } else {
            this.isElectric = true;
            return this.isElectric;
        }

    }
}
