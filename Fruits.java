import java.util.*;
public class Main
{
   public static Fruits maxPriceFruit(Fruits fruit[],int rating1)
   { int maxiPrice=0;
   Fruits fruitwithmaxprice= null;
       for (int i=0;i<fruit.length;i++)
       {
           if (rating1<fruit[i].getRating())
           {
               if (maxiPrice<fruit[i].getPrice())
               maxiPrice=fruit[i].getPrice();
               fruitwithmaxprice=fruit[i];
           }
       }
     
       return fruitwithmaxprice;
   } 
    
    public static void main( String[] args)
    {
    int fruitId;
     String fruitName;
       int price;
       int rating;  
      
       Fruits[] fruit = new Fruits[4];
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<fruit.length;i++)
       {
           fruitId=sc.nextInt();
           sc.nextLine();
            fruitName=sc.nextLine();
            price=sc.nextInt();
            rating=sc.nextInt();
           fruit[i]=new Fruits(fruitId,fruitName,price,rating);
       }
       int rating1= sc.nextInt();
       
        Fruits ans= maxPriceFruit(fruit,rating1);
        if (ans== null)
        System.out.println("No such fruit");
        else   
         System.out.println(ans.getfruitId());
        
    }
}
 
 
  class Fruits
 {
      private int fruitId;
      private String fruitName;
      private int price;
      private int rating;
      
      Fruits(int fruitId,String fruitName,int price,int rating)
      {
          this.fruitId=fruitId;
          this.fruitName=fruitName;
          this.price=price;
          this.rating=rating;
      }
      public int getfruitId()
      {
          return this.fruitId;
      }
      public int getPrice()
      {
          return this.price;
      }
       public int getRating()
      {
          return this.rating;
      }
      public void setfruitId(int fruitId)
      {
           this.fruitId=fruitId;
      }
      public void setfruitName(String fruitName)
      {
          this.fruitName=fruitName;
      }
      public void setRating(int rating)
      {
          this.rating=rating;
      }
       
 } 






/*
101
apple
40
4
102
orange
50
5
103
guava
90
2
104
grape
56
1
4
*/
