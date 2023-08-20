package org.git.coding;

public class Palindrome {
    public static void main(String[] args) {
        String s = "radar";
        String rev = "";
        char ch;

        for (int i=s.length()-1;i>=0;i--){
            ch = s.charAt(i);
            rev = ch + rev;
        }

        System.out.println(rev);
    }
}
