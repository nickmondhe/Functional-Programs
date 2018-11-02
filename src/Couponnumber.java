import java.util.*;
public class Couponnumber 
{
	public static void generaterandom()
	{
		Random t=new Random();
		for(int j=0;j<10;j++)
		{
			System.out.println(t.nextInt(50));
		}
		
	}
	public void Total()
	{
		
	}
	public static void main(String arg[])
	{
		generaterandom();	
	}
}
