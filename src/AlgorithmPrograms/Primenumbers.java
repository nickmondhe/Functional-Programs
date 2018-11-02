package AlgorithmPrograms;

public class Primenumbers 
{
	static void primenumber()
	{
		int n = 100;
		System.out.println("Prime numbers 0 to "+n);
		for(int i=0;i<1000;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}		
			}
			if(isprime)
			{
				System.out.println(" "+i);
			}
		}
	}
	public static void main(String arg[])
	{
		primenumber();
	}
}
