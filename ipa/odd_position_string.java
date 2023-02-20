import java.util.*;
class Main{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch= s.toCharArray();
       
         for(int i=0;i<ch.length;i+=2)
        {
           
                System.out.print(ch[i]);
            
        }
       
    }
}


import java.util.*;
class Main{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
         for(int i=0;i<s.length();i+=2)
        {
           
                System.out.print(s.charAt(i));
            
        }
       
    }
}
