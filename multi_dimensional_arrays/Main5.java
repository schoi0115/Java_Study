package introduction.multi_dimensional_arrays;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args){
        int[][][] numbers = new int[2][3][5]; //two rows three columns
        numbers[0][0][0] = 1;

        int[][] numbers1 = {{1,2,3}, {4,5,6}};


        System.out.println(Arrays.deepToString(numbers1));
    }
    
}
