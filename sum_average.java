package sum_average;
	import java.util.Scanner;
	import java.util.Arrays;
	public class sum_average
	{
	    public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        float average;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        Arrays.sort(a);
	        System.out.println("Sorted numeric array : "+Arrays.toString(a));
	        System.out.println("Sum:"+sum);
	        average = (float)sum / n;
	        System.out.println("Average:"+average);
	    }
	}