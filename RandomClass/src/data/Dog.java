/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

public class Dog extends Pet {
    public static final double MAX_SPEED = 50;
    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
//        Random r = new Random();
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|Dog  |%-10s|%4d|%2.1f|%2.2f|\n",
                name, yob, weight, run());
    }
    
}
