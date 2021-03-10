package dayofmonth;
import java.util.Scanner;
import java.util.regex.Pattern;

public class day_of_month {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String iMonth,iYear;
		int num1,num2;
		int i=0,K=0;
		do {
		do
		{
		System.out.println("plesae input year");
		iYear = keyboard.next();
		num2 = Integer.parseInt(iYear);
		}while(num2<0);
		do {
		System.out.println("please input month");
		iMonth = keyboard.next();
		
		}while(iMonth.isEmpty());
		String[] array1 = {"JanuaryJan.","Feb.February","Mar.March","Apr.April","May","June","July","Aug.August","Sept.September","Oct.October","Nov.November","Dec.December"};
		String[] array4 = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		int count=0,j;
		for( j=0;j<=11;j++)
		{
			if(array1[j].toLowerCase().contains(iMonth) ||array4[j].toLowerCase().contains(iMonth))
			{
			count =(j+1);
			break;
			}
		}
		switch(count) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("Month " + iMonth + " Year " + iYear + " has 31 day\n");
					break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("Month " +iMonth+ " Year " +iYear+ " has 30 day\n");
					break;
		case 2 : 
			if((num2 % 4 == 0 && num2 % 100 != 0) || num2 % 400 == 0)
					System.out.println("Month " + iMonth + " Year " +iYear+ " has 29 day\n");
				else System.out.println("Month " + iMonth + " Year " +iYear+ " has 28 day\n");
			break;
		default: System.out.println("ko hop le");
		}
		
		}while(K==0);
	}
}
