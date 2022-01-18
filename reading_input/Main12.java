package introduction.reading_input;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");

        String name = scanner.nextLine().trim();
        System.out.println("You are" +  name);

    }             
    
}
