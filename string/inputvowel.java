package string;

import java.util.Scanner;

public class inputvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  new string : ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // taking all the  charecter as a input
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
            // we can also make the function of the  vowel
        }
        System.out.println("the count is :"+ count);
    }
}
