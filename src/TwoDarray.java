import java.util.*;
public class TwoDarray 
{
	private static Scanner in;

	public static void main(String arg[])
	{
		int[][] arr=new int[10][10];
		in = new Scanner (System.in);
		System.out.println("Enter the no. of rows");
		int row=in.nextInt();
		System.out.println("Enter the no. of col");
		int col=in.nextInt();
		
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("The array is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
