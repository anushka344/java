import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
       int a=0;
       int space=0;
       char[] result= s.toCharArray();
       String b="";
       for(int i=1;i<result.length;i+=2)
       {
     System.out.print(result[i]);
        }
    }
}


Write a Java program to print the characters at the odd position of a given string

Input
Hey there!


Output
e hr!

Explanation
All the characters (including whitespace) at the odd position of the string Hey there! are printed.
