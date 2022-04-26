package com.aakash.conditionalsloops;

public class Conditionals {
    public static void main(String[] args) {
         /*      Syntax of if Statements:
    if(boolean Expression T of F) {
        // body
    }
    else{
        //do this
    }
       */

        int salary = 23000;

//        if (salary >10000) {
//            salary=salary+2000;
//        }else{
//            salary=salary+1000;
//        }
        //Multiple if-else statements

        if(salary>10000){
            salary+=2000;
        }else if (salary>20000){
            salary+=3000;

        }else{
            salary+=1000;
        }
        System.out.println(salary);

    }

}
