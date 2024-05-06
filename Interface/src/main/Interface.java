package main;

import data.*;

public class Interface {

    public static void main(String[] args) {
        runRace();
    }

    public static void runRace() {
        Dog dog = new Dog("Dog1", 2022, 10);
        Pet dogP = new Dog("Dog2", 2023, 5);
        Race dogR = new Dog("Dog3", 2024, 7);

        Motor motor = new Motor("Motor1", "61-F1");
        Race motorR = new Motor("Motor2", "62-L2");

        Race race[] = {dog, (Dog) dogP, dogR, motor, motorR};

        for (Race race1 : race) {
            race1.showRecordOfRace();
        }
    }

}
