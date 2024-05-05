/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showRecord();
    }
    
    public static void showRecord(){
        Dog dog = new Dog("Lulu", 2023, 1.5);
        Pet dogP = new Dog("Dodo", 2023, 2);
        Cat cat = new Cat("Mimi", 2022, 1);
        Pet catP = new Cat("Lala", 2022, 1.2);
        
        Pet pet[] = new Pet[]{new Dog("Fafa", 2022, 1.7),
                                dog, dogP, cat, catP};
//        pet[0] = new Dog("Fafa", 2022, 1.7);
        for (Pet p : pet) {
            p.showRecord();
            
        }
    }
    
}
