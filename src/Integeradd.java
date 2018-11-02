public class Integeradd 
{
	static void Triplet(int arr[],int n)
	{
		boolean found=true;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]);
						System.out.println("");
						System.out.println(arr[j]);
						System.out.println("");
						System.out.println(arr[k]);
						System.out.println("");
						found=true;
					}
				}
			}
		}
		if(found=false)
		{
			System.out.println("not exist");
		}
		
	}
	public static void main(String arg[])
	{
		int arr[]= {0,-1,2,-3,1};
		int n=arr.length;
		Triplet(arr,n);
	}
}
