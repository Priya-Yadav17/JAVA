import java.util.Scanner;



public class Switch {
 public static void main(String[] aegs) {
    Scanner in =new Scanner(System.in);
    String fruit=in.next();
    switch (fruit){
        case "Mango":
        System.out.println("King of the Fruits");
        break;
        case "Apple":
        System.out.println("A sweet red Fruits");
        break;
        case "Orange":
        System.out.println("Round Fruits");
        break;
        default:
        System.out.println("Please enter a valid fruit");

    }

    
 }   
}
