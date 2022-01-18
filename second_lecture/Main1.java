package introduction.second_lecture;

import java.awt.*;

public class Main1 {
    public static void main(String[] args){

        Point point1 = new Point( 1, 2 );
            Point point2 = point1;
            point1.x = 2;
            System.out.println(point2);

    }
}
// public class Main {
//     public static void main(String[] args){
        // byte x = 1;
        // byte y = x;
        // x = 2;

        // System.out.println(y);
        // "Y gets 1 not 2"
//     }
// }