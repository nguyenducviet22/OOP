/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import data.*;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sortShapes();
    }
    
    public static void sortShapes(){
        Rectangle rec = new Rectangle("Dad", "Black", 2, 3);
        Shape recSh = new Rectangle("Dad", "Red", 3, 4);
        Square sq = new Square("Mom", "Blue", 3);
        Rectangle sqRec = new Square("Mom", "Pink", 3.5);
        Shape sqSh = new Square("Mom", "Green", 4);
        Round r = new Round("Me", "Purple", 2);
        Shape rSh = new Round("Me", "Red", 5);
        
        Shape shape[] = new Shape[]{rec, recSh, sq, sqRec, sqSh, r, rSh};
        for (int i = 0; i < shape.length -1; i++) {
            for (int j = i + 1; j < shape.length; j++) {
                if (shape[i].getArea() > shape[j].getArea()) {
                    Shape tem = shape[i];
                    shape[i] = shape[j];
                    shape[j] = tem;
                }
            }
        }
        for (Shape s : shape) {
            s.showInfo();
        }
    }
}
