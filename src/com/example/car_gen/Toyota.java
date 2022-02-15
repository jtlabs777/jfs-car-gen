package com.example.car_gen;

public class Toyota extends Car {
    boolean greatGasMileage;

    public Toyota(String color, int year, int maxSpeed, boolean isElectric, boolean greatGasMileage) {
        super(color, year, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;
    }
}
