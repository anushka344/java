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
