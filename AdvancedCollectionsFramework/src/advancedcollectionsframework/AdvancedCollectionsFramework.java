/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcollectionsframework;

import data.Cabinet;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class AdvancedCollectionsFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        Cabinet ai = new Cabinet();
        
        System.out.println("Enter SE: ");
        se.addStudent();
        
        System.out.println("Enter AI: ");
        ai.addStudent();
//        ai.addStudent();
        
        System.out.println("SE students: ");
        se.printStudentList();
        
        System.out.println("AI students: ");
        ai.printStudentList();
        
    }
    
}
