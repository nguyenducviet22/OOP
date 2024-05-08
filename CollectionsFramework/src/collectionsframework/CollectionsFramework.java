/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsframework;

import data.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class CollectionsFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createArrayList();
    }
    
    public static void createArrayList(){
        List<Student> arrList = new ArrayList();
        Student stu1 = new Student("SE1901", "Harry", 2004, 9.5);
        Student stu2 = new Student("SE1902", "Hermonine", 2003, 9.7);
        Student stu3 = new Student("SE1903", "Ron", 2004, 9.3);
        
        arrList.add(stu1);
        arrList.add(stu2);
        arrList.add(stu3);
        arrList.add(new Student("SE1904", "Draco", 2004, 9.3));
        arrList.add(stu2);
        
        System.out.println("The list has " + arrList.size() + " objs");
        
        System.out.println("Print each student: ");
        Student stu = arrList.get(0);
        stu.showInfo();
        arrList.get(1).showInfo();
        
        System.out.println("Print all students: ");
//        for (Student student : arrList) {
//            student.showInfo();
//        }
        for (int i = 0; i < arrList.size(); i++) {
            arrList.get(i).showInfo();
        }
        
    }
    
}
