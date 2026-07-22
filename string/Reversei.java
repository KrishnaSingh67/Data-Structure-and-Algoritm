package string;

import java.util.Scanner;

public class Reversei {
    // input the string of the even length and reveres the frist half of the string
    public static void main(String[] args) {
        //taking input of the even string
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string : ");
        String s=sc.nextLine();
      if (s.length()%2==0){
          // reverse the string  frist half
          int half=s.length()/2;
          StringBuilder sb= new StringBuilder(s.substring(0,half)).reverse();
          // we have usig the stringbuilder becaus  it doeed not support the + operator or use the appen meathod
//          sb= new StringBuilder(sb + s.substring(s.length() / 2));
          sb.append(s.substring(s.length() / 2));
          System.out.println(sb);
        }
      else {
          System.out.println("entered string is the odd length");
      }
    }
}
