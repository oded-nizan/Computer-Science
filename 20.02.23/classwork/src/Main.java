import java.util.Scanner;
import java.util.Random;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	
	public static void fillSniperArray(Sniper[] arr)
	{
		int x,y,z,k;

		for(int i = 0; i < arr.length; i ++)
		{
			x = random.nextInt(899999) + 100000;
			y = random.nextInt(4) + 1;
			z = random.nextInt(100) + 100;
			k = random.nextInt(z);
			arr[i] = new Sniper(x,y,z,k);
		}
	}

	public static void printSniperArray(Sniper[] arr)
		{
			for(int i = 0; i < arr.length; i ++)
			{
				System.out.println(arr[i].toString());
			}
		}

	public static void bestSniper(Sniper[] arr)
		{
			int index = 0;
			int max = arr[0].percentHit();
			for(int i = 1; i < arr.length; i ++)
			{
				if(max < arr[i].percentHit())
				{
					max = arr[i].percentHit();
					index = i;
				}	
			}
			System.out.println("The best sniper is No." + index + " in the array.");
			System.out.println(arr[index].toString());
		}

	public static void printMenu()
	{
		
		System.out.println("Please enter one of the following to determen your next action:" + "\n" + "1: print the data of all snipers in the array" + "\n" + "2: print the index and the stats of the best sniper in the array" + "\n" + "-1: exit the menu and terminate the program");
	}

	public static void Menu(Sniper[] arr)
	{
		int x = 0;
		while(x != -1)
		{
			printMenu();
			x = input.nextInt();
			switch(x)
			{
				case 1: printSniperArray(arr);
						break;
				
				case 2: bestSniper(arr);
						break;

				case -1: System.out.println("You have exited this program");
						 break;

				default: System.out.println("You have entered invalid input");
			}
		}
	}





	public static void main(String[] args) {
   		
		Sniper[] arr = new Sniper[100];
		fillSniperArray(arr);
		Menu(arr);
	}
}
