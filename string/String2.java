package string;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string ");
        String st= sc.nextLine();
        int n=st.length();

        // loo for the condion checking is all the word is fierent
        int count =0;
        for (int i=0;i<n-1;i++){
            char curr=st.charAt(i);
            char nex=st.charAt(i+1);

            if (curr != nex) {
                count++;
            }
        }
        System.out.println(count);
    }
}
