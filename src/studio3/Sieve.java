package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
			System.out.println("Enter any Number:");
			int n = in.nextInt(); 
			boolean[]sieve;
			sieve=new boolean[n+1];
			
			for(int i=2;i<Math.sqrt(n);i++)
			{
			
					for(int j=2; j<(n/i); j++)
					{
						sieve[j*i]= true;
				
					}
		
			}
			for (int i=0; i<=n; i++)
			{
								if (sieve[i]== false)
				{
				System.out.println("Following are prime numbers: " + i);
				}
			}
	}
	
}
