import java.util.Scanner;
public class Stopwatch 
{
	int n;
	public static long startTime=0;
	private long endTime=0;
	private boolean running = false;
	private static Scanner in;
	public void start()
	{
		System.out.println(java.time.LocalTime.now()); 
		
	}
	public void stop()
	{
		System.out.println(java.time.LocalTime.now()); 
		
	}
	public void getelapsedTime()
	{
		long elapsed;
		if(running)
		{
			elapsed=((startTime-endTime));
		}
	}
	public void call()
	{	
		if(n==0)
		{
			System.out.println("Watch is start");
			start();
		}
		else if(n==1)
		{
				stop();	
		}
	}
		
	public static void main(String arg[])
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		Stopwatch s1=new Stopwatch();
		s1.call();
		s1.getelapsedTime();
	}
}