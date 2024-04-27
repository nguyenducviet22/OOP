package vietnd.mai;

import vietnd.util.JavaTools;

public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + JavaTools.PI);
        
        int n = JavaTools.getAnInteger("Enter your number: ");
        System.out.println("number: " + n);
    }
    
    
}
