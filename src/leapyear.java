import java.util.*;
public class leapyear 
{
	private static Scanner sc;

	public static void main(String arg[])
	{
		sc = new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag=false;
		if(year%100==0)
		{
			flag=true;
		}
		else if(year%400==0)
		{
			flag=false;
		}
		else if(year%4==0)
		{
			flag=true;
		}
		if(flag)
		{
			System.out.println("Year "+year+" is a leap year");
		}
		else
		{
			System.out.println("Year "+year+" is not a leap year");
		}
	}
}
