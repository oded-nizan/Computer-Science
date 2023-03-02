import java.util.Random;
import java.util.Scanner;

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

	public static void print2DArrayDouble(double[][] a){
		for (int i = 0; i < a[0].length; i ++)
		{
			System.out.println(a[1][i] + ": " + a[0][i]);
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
			System.out.println("and their percentage of shots hit to shots fired is : " + arr[index].percentHit());
		}


	public static int highestAvgSniper(Sniper[] arr)
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
		return index;
	}


	public static double unitsAVG(Sniper[] arr, int p)
	{
		int sum = 0, m = 0;
		double avg;
		for (int i = 0; i < arr.length; i ++)
		{
			if (arr[i].getCode() == p)
			{
				sum += arr[i].percentHit();
				m ++;
			}
		}
		if (m == 0)
		{
			return -1.0;
		}
		avg = sum / m;
		return avg;
	}

	public static void excellentPerUnit(Sniper[] arr, int p )
	{
		int m = 0;
		for (int i = 0; i < arr.length; i ++)
		{
			if (arr[i].getCode() == p && arr[i].excellent())
			{
				m ++;
			}
		}
		System.out.println("The units number of excellent snipers is : " + m);
	}

	public static int excellentPerUnitI(Sniper[] arr, int p )
	{
		int m = 0;
		for (int i = 0; i < arr.length; i ++)
		{
			if (arr[i].getCode() == p && arr[i].excellent())
			{
				m ++;
			}
		}
		return m;
	}

	public static void excellentAllUnits(Sniper[] arr)
	{
		for (int i = 1; i <= 5; i ++)
		{
			System.out.print(i + ": ");
			excellentPerUnit(arr, i);
			System.out.println();
		}
	}

	public static void avgAllUnits(Sniper[] arr)
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.print(i + ": ");
			System.out.println(unitsAVG(arr, i));
		}
	}


	public static void sortedAvgAllUnits(Sniper[] arr)
	{
		double[][] a = new double[2][5];
		for (int k = 1; k <= 5; k ++)
		{
			a[0][k-1] = unitsAVG(arr, k);
			a[1][k-1] = k;
		}

		for (int i = 0; i < a[0].length - 1; i++)
		{
			for (int j = 0; j < a[0].length - 1; j ++)
			{
				if (a[0][j] < a[0][j+1])
				{
					double pl1 = a[0][j];
					a[0][j] = a[0][j+1];
					a[0][j+1] = pl1;

					double pl2 = a[1][j];
					a[1][j] = a[1][j+1];
					a[1][j+1] = pl2;
				}
			}
		}

		avgAllUnits(arr);
		print2DArrayDouble(a);
	}

	public static void printMenu()
	{
		
		System.out.println("Please enter one of the following to determine your next action : ");
		System.out.println("1: prints all data of all snipers in the array");
		System.out.println("2: prints the number and data of the best sniper in the array");
		System.out.println("3: prints the average shots hit percentage of a unit for the snipers in the array");
		System.out.println("4: prints the number of excellent snipers for each unit");
		System.out.println("5: prints the average shots hit percentage for all units");
		System.out.println("6: prints the average shots hit percentage for all units in a sorted order");
		System.out.println("-1: exit the program");
		System.out.println("Please enter your choice: ");
	}

	public static void Menu(Sniper[] arr)
	{
		int x = 0;
		while(x != -1)
		{
			printMenu();
			x = input.nextInt();
			switch (x) {
				case 1:
					printSniperArray(arr);
					break;

				case 2:
					bestSniper(arr);
					break;

				case 3:
					System.out.println("Enter desired unit's number: ");
					int p = input.nextInt();
					double z = unitsAVG(arr, p);
					System.out.println("The unit's average is : " + z);
					break;

				case 4:
					excellentAllUnits(arr);
					break;

				case 5:
					avgAllUnits(arr);
					break;

				case 6:
					sortedAvgAllUnits(arr);
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
