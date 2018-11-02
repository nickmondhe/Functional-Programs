import static java.lang.Math.*;
import java.util.Scanner;
public class Quadratic 
{
	private static Scanner in;
	void findroots(int a,int b, int c)
	{
		if(a==0)
		{
			System.out.println("Invaild");
			return;
		}
		
		int d = b*b - 4*a*c;  
		double sqrt_val = sqrt(d);
		if(d > 0)
		{
			System.out.println("The Root are real and different");
			System.out.println((double)(-b + sqrt_val) / (2*a)+"\n"+
       					   	   (double)(-b - sqrt_val) / (2*a));
		}	
		else
		{
			System.out.println("Roots are complex \n"); 
	        System.out.println( -(double)b / ( 2 * a ) +"+i"+sqrt_val +"\n"+
	        					-(double)b / ( 2 * a ) +"-i"+sqrt_val);
		}
	}
	public static void main(String arg[])
	{
		Quadratic q1=new Quadratic();
		in = new Scanner(System.in);
		System.out.println("Enter the The values of a,b and c");
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		q1.findroots(n, m, k);
	}
}