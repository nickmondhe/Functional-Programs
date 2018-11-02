import java.util.Scanner;
public class WindChill 
{
	
	private static Scanner in;
	void printwindchill(double t, double v)
	{
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("The Wind Chill is : " + w);
	}
	public static void main(String arg[])
	{
		WindChill w1=new WindChill();
		in = new Scanner(System.in); 
		System.out.println("The Temperature should be less than 50 ");
		double t=in.nextDouble();
		System.out.println("The Wind speed should be greater than 120 OR less than 3");
		double v=in.nextDouble();
		w1.printwindchill(t, v);
	}
}
