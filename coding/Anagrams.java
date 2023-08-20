package org.git.coding;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "wasim";
        String s2 = "maiws";
        int count =0;

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    count ++;
                }
            }
        }
        if(count == s2.length()){
            System.out.println("String is anagram");
        }
    }
}
