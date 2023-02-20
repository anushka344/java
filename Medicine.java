import java.util.*;
class Main{
    public static Medicine[] medPriceForGivenDis(Medicine[] medicines, String disease2 )
    {
       Medicine[] help=new Medicine[0];
        for(int i=0;i<medicines.length;i++)
        {
            if(medicines[i].getdisease().equals(disease2))
            {
                help=Arrays.copyOf(help,help.length+1);
                help[help.length-1]= medicines[i];
            }
        }
        //sort
        for(int i=0;i<help.length-1;i++)
        {
            for(int j=0;j<help.length-i-1;j++)
            {
                if(help[j].getprice()>help[j+1].getprice())
                {
                    Medicine temp= help[j+1];
                    help[j+1]=help[j];
                    help[j]=temp;
                    
                }
            }
        }
        return help;
    }
    public static void main(String[] args)
    {
          String name;
    String no;
    String disease;
    int price;
        Scanner sc= new Scanner(System.in);
        Medicine[] medicines= new Medicine[4];
        for(int i=0;i<4;i++)
        {
            name=sc.nextLine();
            no=sc.nextLine();
            disease=sc.nextLine();
            price= sc.nextInt();
             sc.nextLine();
            medicines[i]=new Medicine(name,no,disease,price);
        }     
       
       String disease2=sc.nextLine();
        Medicine[] ans= medPriceForGivenDis(medicines,disease2);
        if(ans.length>0)
        {
            for(int i=0;i<ans.length;i++)
            System.out.println(ans[i].getprice());
        }
        else
        {
            System.out.println("Nt Found");
        }
       
    }
}

class Medicine
{
    String name;
    String no;
    String disease;
    int price;
    Medicine(String name, String no, String disease, int price)
    {
        this.name=name;
        this.no=no;
        this.disease=disease;
        this.price=price;
    }
    public String getname()
    {
        return this.name;
    }
    public String getno()
    {
        return this.no;
    }
    public String getdisease()
    {
        return this.disease;
    }
    public int getprice()
    {
        return this.price;
    }
    
}

/*
Hyadry
we34
eye
45
Hydra2
we35
lip
67
hydra3
we36
eye
12
hydra5
we12
lip
144
lip



67
144
*/
