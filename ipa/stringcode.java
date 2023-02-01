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
       for(int i=0;i<result.length;i++)
       {
           if(Character.isLetter(result[i]))
           a++;
           if(Character.isSpace(result[i]))
           space++;
       }
       
       
       
          
         System.out.println("space: "+space+" character: "+a);
         
    }
}

/*
https://www.geeksforgeeks.org/character-class-java/
*/
