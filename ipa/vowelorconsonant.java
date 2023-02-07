import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        String input;
        Scanner sc= new Scanner(System.in);
        input=sc.nextLine();
       int c=0;
       int vowel=0;
      input=input.toLowerCase();
       
       for(int i=0;i<input.length();i++)
       {
               if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
                    vowel+= 1;
                else
                    c += 1;
               }
        }
        System.out.print(vowel);
    }
}



OR


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner str=new Scanner(System.in);
        String word=str.nextLine();
        word=word.toLowerCase();
        char[] ch= word.toCharArray();
        int v=0;
        int c=0,d=0;
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
           if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o' ||ch[i]=='u')
           v++;
           else
           System.out.println(ch[i]);
            }
        }
        System.out.println("vowels:"+v);
         
           
    }
}
