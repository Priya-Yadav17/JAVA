public class Cond {
    public static void main(String[] args) {
        // syntax of if statement
        /*if (boolean expression T or F){
            //body
        }else{
            //do this
        } 
        */
        int salary =30000;
        // if(salary>=10000){
        //     salary=salary+2000;
        // }else{
        //     salary=salary+1000;
        // }



        // multiple if else 

        if(salary>2000){
            salary+=1000;
        }
        else if(salary>30000){
            salary+=2000;
        }
        else{
            salary+=3000;
        }

        

        System.out.println(salary);
    }
}
