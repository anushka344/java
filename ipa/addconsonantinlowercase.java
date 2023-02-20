import java.util.*;
class Main{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        char[] ch= s.toCharArray();
         for(int i=0;i<ch.length;i++)
        {
            if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'))
             System.out.print(ch[i]);
        }
       
    }
}
