package string;

import java.util.Scanner;

public class stringAll {
    public static void main(String[] args) {
        // taking the input of the string
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
 int n=s.length();
//      . Input a string of length greater than 5 and reverse the substring from position 2 to 5 using inbuilt
//functions.

        // chekeingthe length is greater than 5
        if(n>5){
            StringBuilder sb= new StringBuilder(s.substring(2,5)).reverse();
            System.out.println(sb);
        }else System.out.println(" length of the string id less than 5 ");

    }
}
