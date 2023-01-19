import java.util.*;
public class Main
{
  public static void main( String[] args)
  {
  
   Scanner sc = new Scanner(System.in);
  String str1="i love";
  String str2="i Love";
  String str3 = new String("i love");
   System.out.println(str1==str3);
     System.out.println(str1.equals(str3));
    System.out.println(str1==str2); 
      System.out.println(str1.equals(str2));
  
  }
       
 } 

/*
false
true
false
false
*/
