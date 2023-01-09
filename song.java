import java.util.*;
public class Main
{
   public static double  findSongDurationForArtist (Song[] songs, String artist1)
    {
        double time=0;
       for (int i=0;i<songs.length;i++)
       {
           if ((songs[i].getArtist()).equalsIgnoreCase(artist1))
           time+=songs[i].getDuration();
       }
       return time;
   } 
    public static Song[] getSongsInAscendingOrder (Song songs[], String artist2)
    {
       Song[] help = new Song[0];
          for (int i=0;i<songs.length;i++)
          {
                if ((songs[i].getArtist()).equalsIgnoreCase(artist2))
                {
                     help=Arrays.copyOf(help,help.length+1);
                    help[help.length-1]=songs[i];
                }
          }
          //bubble sort 
          for (int i=0;i<help.length-1;i++)
          {
              for (int j=0;j<help.length-i-1;j++)
              {
                  if (help[j].getDuration() > help[j+1].getDuration())
                  {
                      Song temp=help[j+1];
                      help[j+1]=help[j];
                      help[j]=temp;
                  }
              }
          }  
          if (help.length==0)
          return null;
          else
          return help;
       
    
    }
    public static void main( String[] args)
    {
    
     int songId;
     String title;
      String artist;
      double duration;
      Song[] songs = new Song[5];
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<songs.length;i++)
    {
           songId=sc.nextInt();
          sc.nextLine();
            title=sc.nextLine();
            artist=sc.nextLine();
            duration=sc.nextDouble();
           songs[i]=new Song (songId,title,artist,duration);
       }
       String artist1= sc.nextLine();
          String artist2= sc.nextLine();
       
    double ans= findSongDurationForArtist (songs, artist1);
    if (ans>0)
    System.out.println(ans);
    else
     System.out.println("There are no songs with given artist");
    
   Song[] ans2 =getSongsInAscendingOrder(songs,artist2);

       if(ans2==null)

       {

           System.out.println("There are no songs with given artist");

       }

       else {

           for (int i = 0; i <ans2.length ; i++) {

               System.out.println(ans2[i].getsongId());

               System.out.println(ans2[i].getTitle());

           }

       }
    }
}
 
 
  class Song
 {
      private int songId;
      private String title;
      private String artist;
      private double duration;
      
      Song(int songId,String title,String artist, double duration)
      {
          this.songId=songId;
          this.title=title;
          this.artist=artist;
          this.duration=duration;
      }
      public int getsongId()
      {
          return this.songId;
      }
      public String getTitle()
      {
          return this.title;
      }
       public String getArtist()
      {
          return this.artist;
      }
      
      public double getDuration()
      {
          return this.duration;
      }
      
      
       
 } 


/*
2150
In time
Justin Timberlake
4
250
Cry Me
Justin Timberlake
3
1200
Mirrors
Justin Timberlake
5
1300
That's the way it is
celion dion
5
500
Ashes
celion dion
3
celion dion
Justin Timberlake



*/

Question: 
create the class Song with below attributes.



songId - int 

  title - String

 artist -  String

duration-double



The above attributes should be private, getters, setters and parameterized 

constructor as required. 



Create class MyClass with main method.



implement two static methods - findSongDurationForArtist and

getSongsInAscendingOrder in MyClass class.



findSongDurationForArtist method: This method will take two input 

parameters of Song objects and String parameter The method will return


 the sum of song duration from array of Song object for the giver

 artist (String parameter passed).



If no Song with the given artist is present in the array of Song objects,

  then the method should return zero.



getSongsInAscendingOrder method: This method will take input parameters

 array, of Song objects and String parameter.The method will return Song


 objects array in an ascending order of their duration, from the array of


 Song objects whose artist attribute matches with the input String parameter. 

If no Song with the given artist is present in the array of Song objects,

 then the method should return null



Note: No two Song object would have the same songid.



Combination of artist and duration should be unique.



All the searches should be case insensitive.



The above mentioned static methods should be called from the main method.



For getfindSongDuration ForArtist method - in method should print the sum 


of duration of artist as it is, if the returned value is greater than 0.


 or it should print "There are no songs with given artist".



For getSongsinAscendingOrder method - The main method should print the song

 id and title from the returned song object array if the returned value

 is not null. 

If the returned value is null then it should print 

"There are no songs with given artist".





For Example,

112

ABC

where 112 is song ld. ABC is song title.

Before calling these static methods in main, use. Scanner object to read

 the values of five Song objects referring attributes in the above


 mentioned attribute sequence. Next, read two String values for capturing

 artists.
