import java.util.*;
class Main{
       public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for(int i =0;i<medicines.length;i++) {
            medicines[i] = new Medicine(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
        }
        String disease = sc.nextLine();
        sc.close();
        
         Integer[] result = getPriceByDisease(medicines,disease);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
}

public static Integer[] getPriceByDisease(Medicine[] medicines, String disease)
{
    Integer[] help = new Integer[0];
    for(int i=0;i<medicines.length;i++)
    {
        if(disease.equals(medicines[i].getDisease()))
        {
            help=Arrays.copyOf(help,help.length+1);
            help[help.length-1]=medicines[i].getPrice();
        }
    }
    //sort
   Arrays.sort(help);
   return help;

}
}

class Medicine{
    String MedicineName;
    String batch;
    String disease;
    int price;

    public String getDisease() {
        return disease;
    }
    public int getPrice() {
        return price;
    }

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}

/*
import java.util.*;
class Main{
       public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for(int i =0;i<medicines.length;i++) {
            medicines[i] = new Medicine(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
        }
        String disease = sc.nextLine();
        sc.close();
        
         Integer[] result = getPriceByDisease(medicines,disease);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
}

public static Integer[] getPriceByDisease(Medicine[] medicines, String disease)
{
    Integer[] help = new Integer[0];
    for(int i=0;i<medicines.length;i++)
    {
        if(disease.equals(medicines[i].getDisease()))
        {
            help=Arrays.copyOf(help,help.length+1);
            help[help.length-1]=medicines[i].getPrice();
        }
    }
    //sort
   Arrays.sort(help);
   return help;

}
}

class Medicine{
    String MedicineName;
    String batch;
    String disease;
    int price;

    public String getDisease() {
        return disease;
    }
    public int getPrice() {
        return price;
    }

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}

*/
