import java.util.*;
class Student
{
  private int id;
   private  String name;
  private   int marks;
  private   int age;
   
   Student(int id,
   String name,
   int marks,
   int age)
   {
      this.id=id;
      this.name=name;
      this.marks=marks;
      this.age=age;
   }
   public String getname()
   {
      return this.name;
   }
   public int getid()
   {
      return this.id;
   }
   public int getmarks()
   {
      return this.marks;
   }
   public int getage()
   {
      return this.age;
   }
}
public class Main
{
   public static Student findStudentWithMaxAge(Student[] student)
   {
      Student ans= null;
      int maxage=0;
      for (int i=0;i<student.length;i++)
      {
         if(student[i].getage()>maxage)
         {
            maxage=student[i].getage();
            ans=student[i];
         }
      }
      return ans;
      
   } 
   public static Student searchStudentById(Student[] student, int id1)
   {
       Student ans2= null;
      for (int i=0;i<student.length;i++)
      {
         if(student[i].getid()==id1)
         {
            ans2=student[i];
            break;
         }
      }
      return ans2;
   }
   
   public static void main(String[] args)
   {
       int id;
   String name;
   int marks;
   int age;
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
   Student[] student= new Student[n];
   
   for (int i=0;i<n;i++)
   {
    id= sc.nextInt();
    sc.nextLine();
    name= sc.nextLine();
     marks= sc.nextInt();
     age= sc.nextInt();
    student[i]=new Student(id,name,marks,age);
      
   }
   int id1= sc.nextInt();
   Student ans= findStudentWithMaxAge(student);
   System.out.println("id:"+ans.getid());
   System.out.println("name:"+ans.getname());
   
   Student ans2= searchStudentById(student,id1);
   if(ans2==null)
   {
      System.out.println("no data");
   }
   else
   {
      System.out.println("id:"+ans2.getid());
   System.out.println("name:"+ans2.getname());
   }
   
   
   
   }
       
 } 




/*
4
100 
jisha
35
23
104
uma
30
45
105
eva36
21
56
102
cissy
24
51
100
*/
