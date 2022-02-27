package bootcamp.hackerrank;
import java.util.*;
import java.util.Scanner;
/*
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
A<B<C<....<Z<a<b<c<...<z
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
Given a string, , and an integer, , complete the function so that it finds the
lexicographically smallest and largest substrings of length .

Function Description
--------------------------
Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns
--------
string: the string ' + "\n" + ' where and are the two substrings

Input Format
-------------
The first line contains a string denoting s.
The second line contains an integer denoting k.

Input                    Output
-------                 --------
welcometojava           ava
3                       wel

Explanation
-----------------
String s = "welcometojava" has the following lexicographically-ordered substrings of length k=3
[ava, com, elc, eto, jav, lco, met, oja, ome, toj, wel]
We then return the first (lexicographically smallest) substring and the last
(lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 */


public class lexicographOrder {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int len = s.length();
        String[] array = new String[len-k+1];

        for(int i = 0; i <= len-k; i++){
            array[i] = s.substring(i,i+k);
            }
       smallest = array[0];
       largest = array[0];

        for(int i = 1; i<=len-k; i++){
            if(smallest.compareTo(array[i])>0){
                smallest = array[i];
            }
            if(largest.compareTo(array[i])<0){
                largest = array[i];
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(str,k));
    }
}
