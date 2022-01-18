package introduction.strings;

public class Main2 {
    public static void main(String[] args){
        String message = "  Hello World  " + "!!";
        
        // String message = new String("Hello World"); - You can do both
        System.out.println(message.length());
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.indexOf("W"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!","*"));
        // System.out.println(message.replace(targer:"!", replacement:"*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);
    }
    
}
