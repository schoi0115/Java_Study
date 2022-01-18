package introduction.casting;

public class Main9 {
    public static void main(String[] args){
        //Implicit casting
        // byte > short > int > long > float > double
        // short x = 1;
        double x = 1.1;
        // double y = x + 2; // change to 2.0
        // int y = (int)x + 2;
        float y = (float)x + 2;

        String z = "1";
        int g = Integer.parseInt(z) + 2;
        double h = Double.parseDouble(z) + 5;
        // Short.parseInt();
        // Float.parseFloat();
        // Short.parseShort();
        System.out.println(g);
        System.out.println(h);
    }
    
}
