package introduction.Arrays;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        // int[] numbers = new int[5];   - this is old way
        // numbers[0] = 1;
        // numbers[1] = 2; 
        // numbers[10] = 3;
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5 at introduction.Arrays.Main4.main(Main4.java:8)
        // Arrays.toString(numbers); //method overload
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = {2,3,5,1,4,8};
        Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        
        
        
    }
    
}
