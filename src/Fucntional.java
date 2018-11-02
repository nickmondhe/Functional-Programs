import java.util.Scanner;
public class Fucntional 
{
	private static Scanner sc;

	public static void main(String arg[])
	{
		sc = new Scanner(System.in);
		String s1=sc.nextLine();
		if(s1.length()>=3)
		{
			String replaceString=s1.replace(s1,"Nikhil");
			System.out.println(replaceString);
		}
		else
		{
			System.out.println("The string is not match");
		}
	}
}
