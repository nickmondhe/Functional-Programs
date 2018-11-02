import java.util.*;
public class Harmonicnumber 
{
	private static Scanner in;

	public static void main(String arg[])
	{
		in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("The harmonic number");
		double result=1;
		while(n>0)
			{
				result=result+(double)1/n;
				n--;
				System.out.println(""+result);
			}
		System.out.println("\n");
		
	}
}