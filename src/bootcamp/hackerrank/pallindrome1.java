package bootcamp.hackerrank;
import java.util.Scanner;

public class pallindrome1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        str.append(A);
        str1.append(A);
        str.reverse();
        if(str1.compareTo(str)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
