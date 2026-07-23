package string;

import java.util.Scanner;

public class stringAll {
    public static void main(String[] args) {
        // taking the input of the string
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
 int n=s.length();

//     1 . Input a string of length greater than 5 and reverse the substring from position 2 to 5 using inbuilt  functions.
        // chekeingthe length is greater than 5
        if(n>5){
            StringBuilder sb= new StringBuilder(s.substring(2,5)).reverse();
            System.out.println(sb);
        }else System.out.println(" length of the string id less than 5 ");

//        2. Input a string of even length and return the second half of that string using inbuilt substr function
        if (n%2==0){
            StringBuilder ab= new StringBuilder(s.substring(n/2));
            System.out.println(ab);
        }else System.out.println("string length is not eveen ");

//        3. Return the total number of digits in a number without using any loop.
//                Hint : Try using inbuilt to_string() function
         int number=980736;
         String num=Integer.toString(number);
        System.out.println(num.length());

    }
}
