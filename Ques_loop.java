// package Java;
import java.util.*;

public class Ques_loop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();



        //find the largest no in the 3 no

        // 1st type


        // int max=a;
        // if(b>max){
        //     max=b;
        //    }
        // if(c> max){
        //     max=c;
        // }

 // 2nd type

        int max=0;
        if(a>b){
            max=a;
           }
           else{
            max=b;
           }
        if(c> max){
            max=c;
        }
        System.out.println(max);


        // 3rd type
    // int max=Math.max(c,Math.max(a,b));
    // System.out.println(max);
    }
    
}
