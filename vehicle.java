import java.util.*;
class Main{
    public static Vehicle findvehWithMinPrice( Vehicle[] vehicles)
      {   Vehicle ans=null;
         double price=Double.MAX_VALUE;
         for(int i=0;i<vehicles.length;i++)
         {
             if(vehicles[i].getprice()<price)
             {
                 price= vehicles[i].getprice();
                 ans=vehicles[i];
             }
             
             
         }
         return ans;
           
    }
    public static Vehicle findvehByName(Vehicle[] vehicles, String name2)
    {
        Vehicle ans2=null;
         for(int i=0;i<vehicles.length;i++)
         {
             if(vehicles[i].getname().equals(name2))
             {
                 ans2=vehicles[i];
                 break;
             }
         }
         return ans2;
    }
    public static void main(String[] args)
    {
         int no;
    String name;
    double price;
    int n;
    Scanner sc= new Scanner(System.in);
    n= sc.nextInt();
    Vehicle[] vehicles= new Vehicle[n];
    for(int i=0;i<n;i++)
    {
        no= sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        price=sc.nextDouble();
        vehicles[i]= new Vehicle(no,name,price);
    }   
    sc.nextLine();
    String name2=sc.nextLine();
    Vehicle ans= findvehWithMinPrice(vehicles);
    if(ans!=null)
    {
        System.out.println("no: "+ans.getno());
        System.out.println("name: "+ans.getname());
        System.out.println("price: "+ans.getprice());
    }
    else
    System.out.println("no vehicles");
    Vehicle ans2= findvehByName(vehicles,name2);
      if(ans2!=null)
    {
        System.out.println("no: "+ans2.getno());
        System.out.println("name: "+ans2.getname());
        System.out.println("price: "+ans2.getprice());
    }
    else
    System.out.println("no vehicles");
    }
}

class Vehicle
{
    int no;
    String name;
    double price;
    Vehicle(int no, String name, double price)
    {
        this.no=no;
        this.name=name;
        this.price=price;
    }
    
    public int getno()
    {
        return this.no;
    }
    public String getname()
    {
        return this.name;
    }
    public double getprice()
    {
        return this.price;
    }
}


/*
Create a class Vehicle with below attributes
number-int
String-name
price-double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.
Create class Solution with main method

Implement two static methods-

findVehicleByMinimumPrice 
searchVehicleByName

findVehicleByMinimumPrice 
create a static method
findVehicleByMinimumPrice in the solution class. This method will take array of Vehicle objects and returns the Vehicle objects having the minimum price if found else return null if not found.

searchVehicleByName
create a static method
searchVehicleByName in the Solution class. This method will take array of Vehicle objects and returns the Vehicle objects having the mentioned name if found else return null if not found.

This method should be called from main method.
Write code to perform following tasks:
1. Take necessary input variable and call findVehicleByMinimumPrice. For this method- The main method should print the Vehicle object with minimum of mentioned attribute as it is if the returned value us not null, or it should print "No Vehicle found with mentioned attribute".

2. Take necessary input variable and call searchVehicleByName. For this method- The main method should print the Vehicle object details as it is if the returned value us not null, or it should print "No Vehicle found with mentioned attribute".


Consider below sample input and output to test your code.	

Input 1

4
3111
bus
1000.0
4112
crane
1800.0
5114 
tractor
2400.0
6115
Scooter
2700.0
Scooter

Ouput 1
number-3111
name-bus
price-1000.0
number-6115
name-scooter
price-2700.0
Input 2

4
1109
Train
2000.0
5104
taxi
2800.0
4112
bike
5600.0
8107
Scooter
3300.0
bike

Output 2
number-1109
name-Train
price-2000.0
number-4112
name-bike
price-5600.0

*/

