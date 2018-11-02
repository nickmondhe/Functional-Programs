
public class Gambler 
{
	public static void main(String[] args) 
	{
		int stake=Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trials=Integer.parseInt(args[2]);
		int wins=0;
		for(int i=0;i<trials;i++)
			{
				int cash=stake;
				while(cash> 0 && cash < goal)
				{
					if(Math.random()< 0.5)
						cash++;
					else
						cash--;
				}
				if(cash==stake)
				{
					wins++;
				}
			}
			System.out.println(wins +"Wins"+ trials);
			System.out.println("The percentage of the goals"+100.0*wins/trials);
		}
		

}

