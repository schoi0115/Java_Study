package introduction.first_lecture;

import java.util.Date;



public class Main {
    public static void main(String[] args){

        // Primitive types (simple values)***********
        byte age = 30;
        int viewsCount = 123_456_789; //use _ for long numbers
        long viewCount = 3_123_456_789L; // cannot use it, it reads as integer so use L or l but L looks better
        float price = 10.99F; // This type sees as double Float sufix is F or f

        char letter = 'A'; // char uses ''
        boolean isEligible = false;
        // int temperature = 20;
        // int myAge = 30;
        // int herAge = myAge;
        age = 35;

        //Reference type (contrast)
        byte age1 = 30;
        Date now = new Date();
        //import java.util.Date; created on line 3

        System.out.println(now);
        //sout is short cut

    }
    
}
