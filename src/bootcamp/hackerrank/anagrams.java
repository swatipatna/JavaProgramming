package bootcamp.hackerrank;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive. For example,
the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
==============================
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string

Returns
=========
boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.

Input Format
======================
The first line contains a string .
The second line contains a string .

Constraints
====================
1 <- a(length), length(b) <= 50
Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
 */

public class anagrams {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int lenA = a.length();
        int lenB = b.length();
        if(lenA < 1 || lenB >= 50){
            System.out.println("String length should be between 1 to 50");
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        System.out.println("string a: " + a + "   string b : " + b);

 // create an array for all the english alphabets a,b,c,.., z for both input strings "a" and "b"
        int[] arrayA = new int[26];
        int[] arrayB = new int[26];
        int countA = 0, countB = 0;

        for(int i = 0; i < lenA;i++) {
            char ch = a.charAt(i);
            int index = ch - 97;
            if (arrayA[index] != 0){
                countA = arrayA[index];
                arrayA[index] = countA + 1;
            } else{
                arrayA[index] = 1;
            }
        }
        System.out.println(Arrays.toString(arrayA));

        for(int i = 0; i<lenB;i++) {
          char ch1 = b.charAt(i);
          int idx = ch1 - 97;
          if(arrayB[idx] != 0){
              countB = arrayB[idx];
              arrayB[idx] = countB + 1;
            }else{
                arrayB[idx] = 1;
            }
        }
        System.out.println(Arrays.toString(arrayB));

// compare both the arrays
        int flg = 0;
        int i=0;
        while( i <= 25){
            if(arrayA[i] == arrayB[i]) {
                 flg = 1;
            }
            else{
                flg = 0;
                break;
             }
            i++;
        }
        if (flg==1){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not an Anagram");
        }

    }
}
