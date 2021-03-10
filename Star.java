package a_height_of_n_stars;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("MOI BAN NHAP CHIEU CAO CUA TAM GIAC");
	int iTall = keyboard.nextInt();
	for(int i=1;i<=iTall;i++)
	{
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}
}
}
