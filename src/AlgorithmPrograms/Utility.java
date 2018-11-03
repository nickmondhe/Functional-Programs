package AlgorithmPrograms;
import java.util.Scanner;
public class Utility
{
	public static Scanner in;
    public static int binaryinteger(int arr[],int key)
	{
		int low = 0;
		int high = arr.length-1;
		while(low<high)
		{
			int mid=low +(high-low)/2;
			if(arr[mid]<key)
			{
				high=mid;
			}
			else if(arr[mid]>key)
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}			
		}
		return -(low+1);
	}
	public static int binaryString(String[] names, String key) {
	    int first = 0;
	    int last  = names.length;
	 
	    while (first < last) {
	        int mid = (first + last) / 2;
	        if (key.compareTo(names[mid]) < 0)
	        {
	            last = mid;
	        } 
	        else if (key.compareTo(names[mid]) > 0) 
	        {
	            first = mid + 1;
	        } 
	        else 
	        {
	            return mid;
	        }
	    }
	    return -(first + 1);
	}
	public static int Insertioninteger(int a[])
	{	
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		return 0;
	}
	public static void Insertionstring(String array[])
	{
		int n=array.length;
		String value;
		int index;
		for(int a = 1; a < n; a++){
            char currentCharValue = array[a].charAt(0);
            value = array[a];
            index = a;

            if(currentCharValue == array[a - 1].charAt(0) )
            {
                while (index > 0 && array[index - 1].charAt(1) > array[index].charAt(1))
                {
                    array[index] = array[index - 1];
                    index = index - 1;
                }
            }
            else
            {
                while (index > 0 && array[index - 1].charAt(0) > currentCharValue)
                {
                    array[index] = array[index - 1];
                    index = index - 1;
                }
            }
            array[index] = value;
        }
	}
	public static void bubblesort(int r[])
	{
	}
	public static void main(String arg[])
	{
		in= new Scanner(System.in);
		int ch=0;
		System.out.println("Enter your Choice \n"
				+ "1.BinarySearch method for String \n"
				+ "2.BinarySearch method for Integer \n"
				+ "3.InsertionSearch method for Integer \n"
				+ "4.InsertionSearch method for String \n"
				+ "5.BubbleSort method for Integer \n"  
				+ "6.BubbleSort method for String");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
			in= new Scanner(System.in);
			System.out.println("Enter the string to found :");
			String str=in.nextLine();
			String a[]= {"abc","bcd","htr"};
			int result=binaryString(a,str);
			System.out.println("The element found at "+result);
			break;
		case 2:
			System.out.println("Enter the key to found :");
			int key=in.nextInt();
			int arr[]= {2,4,5,8,10};
			int result1= binaryinteger(arr,key);
			System.out.println("The interger value is at "+result1);
			break;
		case 3:
			System.out.println("The sorted list is :");
			int w[]= {2,4,5,8,6,78,96};
			int n=w.length;
			Insertioninteger(w);
			for(int i=0;i<n;i++)
			{
				System.out.println(w[i]);		
			}
			break;
		case 4:
			System.out.println("The sorted String with using Insertion sort is : ");
			String y[] = {"ai","zo","we","gt"};
			int j=y.length;
			Insertionstring(y);
			for(int i=0;i<j;i++)
			{
				System.out.println(y[i]);
			}
			break;
		case 5:
			System.out.println("The sorted list using Bubble sort is:");
		}		
	}
}