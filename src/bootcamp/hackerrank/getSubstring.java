package bootcamp.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Given a string s  and two indices start and end.
print a substring consisting of all characters in the inclusive range from start to end.
You'll find the String class' substring method helpful in completing this challenge.

Input Format
The first line contains a single string denoting S .
The second line contains two space-separated integers denoting the respective values of start and end.
Constraints
1 <= S <= 100
0<= start <= end <= n
String  consists of English alphabetic letters (i.e.,a..z , A..Z ) only.

SampleInput             Sample Output
------------            -------------
Helloworld              lowo
3 7

 */

public class getSubstring {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            String s1 =  s.substring(start, end);
            System.out.println(s1);

        }
    }

