import java.util.*;
class Main{
    
   
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
     String s= sc.nextLine();
     char[] ch= s.toCharArray();
     for(int i=0;i<ch.length-1;i++)
     {
         if(!Character.isDigit(ch[i]) && Character.isWhitespace(ch[i+1]) &&  !Character.isWhitespace(ch[i]))
         System.out.print(ch[i]);
     }   
     if(!Character.isDigit(ch[ch.length-1]))
     System.out.print(ch[ch.length-1]);
     
}

}

/*
Write a Java program to print the last character of every word in a given string

Conditions
Ignore all the digits and whitespaces

Input
Hey3 Java   Learners
Output
as
Explanation
As the first word Hey3 has digit in its last position, ignore it. The second word Java has multiple white spaces after it. But those white spaces should be ignored and only the last character should be printed. Likewise, the last character of the word Learners should be printed. Thus, the output as.*/
