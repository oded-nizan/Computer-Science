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

	public static int bestSniper(Sniper[] arr)
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




	public static void main(String[] args) {
   		
		Sniper[] arr = new Sniper[100];
		fillSniperArray(arr);
		printSniperArray(arr);
		System.out.println("The best sniper in your array is : " + bestSniper(arr));
	}
}
