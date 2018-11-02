import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Reminder {
    Timer timer;
	private static Scanner in;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() 
        {
        	
        		System.out.println("Times up");
        		System.out.println("The stop time is "+java.time.LocalTime.now());
        		timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) 
    {
    	in = new Scanner(System.in);
    	System.out.println("Enter how much time you want in seconds");
    	int seconds=in.nextInt();
    	
    	System.out.println("Enter 0 to start the watch ");
    	int n=in.nextInt(); 
    	System.out.println(java.time.LocalTime.now());
    	System.out.println("The time is stop in "+seconds+" seconds");
    	new Reminder(seconds);
    	
    }
}
