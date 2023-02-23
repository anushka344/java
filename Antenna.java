import java.util.*;
class Main{
    public static int searchAntennaByName(Antenna[] antennas, String name1)
    {
        int id1=0;
        for(int i=0;i<antennas.length;i++)
        {
            if(antennas[i].getname().equals(name1))
            id1=antennas[i].getid();
        }
        return id1;
    }
    public static Antenna[] sortbyvswr(Antenna[] antennas, double vswr1)
    {
        Antenna[] help= new Antenna[0];
         for(int i=0;i<antennas.length;i++)
         {
             if(antennas[i].getvswr() < vswr1)
             {
                 help=Arrays.copyOf(help,help.length+1);
                 help[help.length-1]=antennas[i];
             }
         }
         //sortbyvswr
         for(int i=0;i<help.length;i++)
         {
             for(int j=0;j<help.length-i-1;j++)
             {
                 if(help[j].getid()>help[j+1].getid())
                 {
                     Antenna temp=help[j+1];
                     help[j+1]=help[j];
                     help[j]=temp;
                 }
             }
        
         }
         if(help.length>0)
         return help;
         else
         return null;
        
    }
   
    public static void main(String[] args)
    {
      
       int id;
    String name;
     String lead;
    double vswr;
    Antenna[] antennas= new Antenna[4];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<antennas.length;i++)
    {
        id=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        lead=sc.nextLine();
    vswr= sc.nextDouble();
    sc.nextLine();
        antennas[i]= new Antenna(id,name,lead,vswr);
        
    }
    String name1=sc.nextLine();
    double vswr1=sc.nextDouble();
    int ans1= searchAntennaByName(antennas,name1);
    if(ans1!=0) System.out.println(ans1);
    else   System.out.println("There is no antenna with the given parameter");
    Antenna[] ans2= sortbyvswr(antennas, vswr1);
    if(ans2.length>0)
    {
        for(int i=0;i<ans2.length;i++)
        System.out.println(ans2[i].getlead());
        
    }
    else
    System.out.println("No Antenna found");
      
}
}

class Antenna
{
    int id;
    String name;
     String lead;
    double vswr;
    Antenna(int id, String name, String lead, double vswr)
    {
        this.id=id;
        this.name=name;
        this.lead=lead;
        this.vswr=vswr;
    }
    public int getid()
    {
        return this.id;
    }
    public String getname()
    {
        return this.name;
    }
    public String getlead()
    {
        return this.lead;
    }
    public double getvswr()
    {
        return this.vswr;
    }

}
