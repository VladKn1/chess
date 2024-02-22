package com.bulder;

import com.bulder.release.AutomotiveEngineer;
import com.bulder.release.Car;
import com.bulder.release.CarBuilder;
import com.bulder.release.SportsCarBuilder;

public class Builder {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
