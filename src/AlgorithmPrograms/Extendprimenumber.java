package AlgorithmPrograms;

public class Extendprimenumber 
{
	static void primenumber()
	{
		int n = 100;
		System.out.println("Prime numbers 0 to "+n);
		for(int i=0;i<100;i++)
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
	static void palidrome()
	{
		int temp,sum=0,r;
		int n=454;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println("The number is palidrome");
		}
		else
		{
			System.out.println("The number is not a plaidrome");
		}
	}
	public static void main(String arg[])
	{
		primenumber();
		palidrome();
	}
}
