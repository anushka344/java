import java.util.*;
public class Main
{
    public static void main( String[] args)
    { int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
    
    TravelAgencies[] travelAgencies  = new TravelAgencies[4];
    Scanner sc = new Scanner(System.in);
    for (int i=0;i<travelAgencies.length;i++)
    {
        regno=sc.nextInt();
        sc.nextLine();
        agencyName=sc.nextLine(); // after integer if u want to take string
        packageType=sc.nextLine();
        price = sc.nextInt();
        flightFacility=sc.nextBoolean();
        
        travelAgencies[i]=new TravelAgencies(regno,agencyName,packageType,price,flightFacility);
    }
        int regno1=sc.nextInt();
         sc.nextLine();
       String packageType1=sc.nextLine();
        
        int highestpack= findAgencyWithHighestPackage(travelAgencies);
        System.out.println(highestpack);
        
        TravelAgencies travel =  agencyDetails(travelAgencies,regno1,packageType1);
          System.out.println(travel.getAgencyName() + ":" + travel.getPrice());
        
    }
    
    public static int findAgencyWithHighestPackage(TravelAgencies[] travelAgencies)
    {
        int maxipack=0;
         for (int i=0;i<travelAgencies.length;i++)
         {
             if (travelAgencies[i].getPrice() > maxipack)
             maxipack=travelAgencies[i].getPrice();
             
         }
         return maxipack;
        
    }
    public static TravelAgencies agencyDetails(TravelAgencies[] travelAgencies,int regno, String packageType)
    {
         for (int i=0;i<travelAgencies.length;i++)
         {
             if(travelAgencies[i].getFlightFacilty())
             {
                 if(travelAgencies[i].getRegNo()==regno && travelAgencies[i].getPackageType().equalsIgnoreCase(packageType))
                 {
                     return travelAgencies[i];
                 }
                 
             }
         }
         return null;
    }
    
}

class TravelAgencies
{
    int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
    
    TravelAgencies(  int regno,
    String agencyName,
    String packageType,
    int price,
    boolean flightFacility)
    {
        
        this.regno=regno;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
        
    }
      public int getRegNo(){
        return  this.regno;
    }

    public String getAgencyName(){
        return this.agencyName;
    }

    public String getPackageType(){
        return this.packageType;
    }

    public int getPrice(){
        return this.price;
    }
    public boolean getFlightFacilty(){
        return this.flightFacility;
    }

    public void setRegNo(int regno){
        this.regno = regno;
    }

    public void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType){
       this.packageType = packageType;
    }

    public void setPrice(int price){
       this.price = price;
    }

    public void setFlightFacility(boolean flightFacility){
        this.flightFacility = flightFacility;

    }
}
