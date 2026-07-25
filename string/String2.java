package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

        // sorting the string  using in build meathod
        char[] charArray=st.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);

//        . Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        String s = "physicswallah", t = "wallahphysic" ;
        if (s.length()!=t.length()){
            System.out.println("not a nagram");
        }
        char[]sarr=s.toCharArray();
        char[]tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
      if (Arrays.equals(sarr,tarr)){
          System.out.println("yes it is the anagram ");
      }
      else System.out.println(" not anagram ");

//    . Given n strings consisting of lowercase English alphabets. Print the character that is occurring most
//number of times.
        String[]stA={"apple","banana","cherry","apple"};
        // store the frequency in the hashmap
        Map<Character,Integer> freq=new HashMap<>();
        //itereate through the each charecters  of the array element
        for (String str:stA){
            for (char c:str.toCharArray()){
                //update the frequency in the map
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
        }
        // Find the character with the highest frequency
        char mostFrequentChar = '\0'; // default value
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry :
                freq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        System.out.println(mostFrequentChar);
    }
}
