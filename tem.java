import java.util.Scanner;

public class tem {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter temp in C: ");
        float temC = in.nextFloat();

        float temF = (temC * 9/5)+32;
        System.out.println(temF);
    }
}