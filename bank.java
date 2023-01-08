import java.util.*;
public class Main
{
   public static int avgNofCustomersBycity(Bank banks[], String city1) 
   {
       int avg1=0;
       int cnt=0;
       for (int i=0;i<banks.length;i++)
       {
           if (banks[i].getCity().equals(city1))
       {    avg1+= banks[i].getnoOfCustomer();
             cnt++;
       }
       }
       if (cnt!=0)
       return (avg1/cnt);
       else
       return 0;
       
   } 
    public static Bank getSecondLowestNoOfCustomer(Bank banks[])
    {
        Bank secondlowest= null;
        int maxi=0;
        int maxi2=0;
        for (int i=0;i<banks.length;i++)
        {
            if ((banks[i].getnoOfCustomer())%2==0 &&   banks[i].getnoOfCustomer()>maxi)
            {
                maxi= banks[i].getnoOfCustomer();
            }
        }
        
         for (int i=0;i<banks.length;i++)
        {
            if ((banks[i].getnoOfCustomer())%2==0 &&   banks[i].getnoOfCustomer()!=maxi && banks[i].getnoOfCustomer()>maxi2)
            {
                maxi2= banks[i].getnoOfCustomer();
                secondlowest= banks[i];
            }
        }
        
        if (secondlowest==null)
        return null;
        else
        return secondlowest;
    
    }
    public static void main( String[] args)
    {
    int bankId;
    String bankName;
    int noOfCustomer;
    String city;
       Bank[] banks = new Bank[4];
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<banks.length;i++)
    {
           bankId=sc.nextInt();
          sc.nextLine();
            bankName=sc.nextLine();
            noOfCustomer=sc.nextInt();
            sc.nextLine();
            city=sc.nextLine();
           banks[i]=new Bank(bankId,bankName,noOfCustomer,city);
       }
       String city1= sc.nextLine();
       
    int ans= avgNofCustomersBycity(banks,city1);
    if (ans>0)
    System.out.println(ans);
    else
     System.out.println("Bank Not Found");
    
    Bank b1= getSecondLowestNoOfCustomer(banks);
    
    if (b1==null)
    {
          System.out.println("Bank Not Found");
        
    }
        else{
              System.out.println(b1.getbankId());
                System.out.println(b1.getbankName());
        }
    }
}
 
 
  class  Bank
 {
      private int bankId;
      private String bankName;
      private int noOfCustomer;
      private String city;
      
      Bank(int bankId,String bankName,int noOfCustomer,String city)
      {
          this.bankId=bankId;
          this.bankName=bankName;
          this.noOfCustomer=noOfCustomer;
          this.city=city;
      }
      public int getbankId()
      {
          return this.bankId;
      }
      public String getbankName()
      {
          return this.bankName;
      }
       public int getnoOfCustomer()
      {
          return this.noOfCustomer;
      }
      
      public String getCity()
      {
          return this.city;
      }
      public void setbankId(int bankId)
      {
           this.bankId=bankId;
      }
      public void setbanktName(String  bankName)
      {
          this.bankName=bankName;
      }
      public void setnoofcust(int noOfCustomer)
      {
          this.noOfCustomer=noOfCustomer;
      }
      public void setCity(String city)
      {
          this.city=city;
      }
       
 } 



/*
42
ABC
400
Chennai
32
PNG
360
Amritsar
25
Canara
200
Chennai
16
RBS
370
Mumbai
Chennai
*/


bankId-int

bankName-String

numberOfCustomers-int

city-String 



write parametrized constructor as well in Bank Class.

Create class Solution  with main method.



Implement 2 Static methods-findAvgNumberOfCustomersByCity and 

getSecondLowestNumberOfCustomersBank in Solution class.





findAvgNumberOfCustomersByCity method-This method will take two input

parameters.Array of Bank Objects and String Parameter city and will return

the average number of customers of bank from array of Bank Objects for the 

given city.

   If no banks with given city present inside the array of the Bank Objects,

then the method should return 0.



The main method should print the average of the number of Customers if the 

returned value is greater than 0.Else main method will print "Bank not Found".





getSecondLowestNumberOfCustomersBank method- This method will take 1 input 

Parameter that is Array of Bank Objects and return Bank Object having the 

second lowest Number of Customers among the Bank Objects only if the number

Of Customers in that Bank is an even number.

   If no bank with above condition is present in the array of Bank Objects,

 then the method should return null.

   The main method should print bankId,bankName,numberOfCustomers and city

from the returned bank Object if the returned value is not null.

else the main method method will print "Bank not Found".

