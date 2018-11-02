public class Arraysreturn 
{
	private static void swap(char [] ch,int i,int j)
	{
		char temp =ch[i];
			 ch[i]=ch[j];
			 ch[j]= temp ;
	}
	private static void recursionpermutations(char []ch, int Index)//recursion method
	{
		if(Index==ch.length-1)
		{
			System.out.println(String.valueOf(ch));
		}
		for(int i=Index;i<ch.length;i++)
		{
			swap(ch,Index,i);
			recursionpermutations(ch, Index+1);
			swap(ch,Index,i);
		}
	}
	static void demo(String s1,String s2)
	{
			System.out.println("Equals String");
			System.out.println(s1.equals(s2));
		
	}
	public static void main(String arg[])
	{
	
		
		String s="ABC";
		System.out.println("First String");
		recursionpermutations(s.toCharArray(), 0);
		
		String s1="CAB";
		System.out.println("Second String");
		recursionpermutations(s1.toCharArray(), 0);
		demo(s,s1);
	}
}
