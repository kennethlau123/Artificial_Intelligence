import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
import java.util.*; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random;
public class Betgame
{

    public static void main(String args[])
	{
        		int win = 0;
			int lose = 0;
			int[] door = new int[0];
			int[] door1= {1,2,3};
			int[] prize = new int[0];
			int[] prize1= {1,2,3};
			int[] choose = new int[0];
			int[] choose1= {1,2,3};
			Random r=new Random(); 
			for (int i = 0; i < 1000000; i++)
			{
				int ran=r.nextInt(door1.length);
				int ran2=r.nextInt(prize1.length);
			    int ran3=r.nextInt(choose1.length);
			    int realdoor = door1[ran];
				int realprize = prize1[ran2];
				int realchoose = choose1[ran3];
				if (realchoose == realprize & realprize == realdoor)
				{
					win++;
				}
				
				else
				{
					ran3=r.nextInt(choose1.length);
						while (choose1[ran3] == realchoose || choose1[ran3] == realdoor)
						{
							ran3=r.nextInt(choose1.length);
						}
						
						if( choose1[ran3] == realprize)
						{
							win ++;
						}
						else 
						{
							lose++;
						}
				}
			}
			int changewin = win;
			int changelose = lose;
			win = 0;
			lose = 0;
			for (int i = 0; i < 1000000; i++)
			{
				int ran=r.nextInt(door1.length);
				int ran2=r.nextInt(prize1.length);
			    int ran3=r.nextInt(choose1.length);
			    int realdoor = door1[ran];
				int realprize = prize1[ran2];
				int realchoose = choose1[ran3];
				if (realchoose == realprize && realprize == realdoor)
				{
					win++;
				}
				
				else
				{						
						if(realchoose == realprize)
						{
							win ++;
						}
						else 
						{
							lose++;
						}
				}
			}
			
			System.out.println("changewin = "+changewin);
			System.out.println("changelose = "+changelose);
			System.out.println("Not change Win = "+win);
			System.out.println("Not change lose = "+lose);
	}
}
