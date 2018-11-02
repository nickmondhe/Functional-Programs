import java.util.*;
public class PowerofTwo 
{
	private static Scanner in;

	public static void main(String arg[])
	{
		in = new Scanner(System.in);
		int n=in.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			if(n>=0)
			{
				n = n * 2;
				
			}
			System.out.println(" "+n);
			
		}
	}
}
