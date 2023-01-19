//gcd 
import java.util.Scanner;

public class GCDofTwo1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Num1, Num2, i, GCD = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Integer Value : ");
		Num1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Integer Value : ");
		Num2 = sc.nextInt();
		
		for(i = 1; i <= Num1 && i <= Num2; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("\n GCD of " + Num1 + " and " + Num2 + "  =  " + GCD);
	}
}

MATRIX MULTIPLICATION
public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] y = {{ 5, 6, 7}, {8, 9,10}, {2,3, 4}};
		
		int[][] multi = new int[3][3];
		int i, j;
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				multi[i][j] = x[i][j] * y[i][j];
			}
		}
		System.out.println("------ The Multiplication of two Matrix ------");
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				System.out.format("%d \t", multi[i][j]);
			}
			System.out.println("");
		}
	}
}
