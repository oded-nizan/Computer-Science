public class Main 
{
    public static void printRoad(int k, int[] rooms, int[] teams)
    {
        while (rooms[k] != -1)
        {
            System.out.println(rooms[k]);
            k = rooms[k];
        }
        System.out.println("This team has reached the end");
    }

    public static void allRoads(int[] rooms, int[] teams)
    {
        for (int i = 0; i < teams.length; i ++)
        {
            printRoad(teams[i], rooms, teams);
            System.out.println("-------------------------------------------------------------");
        }
    }
    
    public static void main(String[] args)
    {
        int[] rooms = new int[]{18, 17, -1, -1, 8, 0, 19, 0, 1, 0, 12, 0, 13, 2, 0, 0, 0, -1, 3, 10};
        int[] teams = new int[]{4, 6, 0, 16};
        allRoads(rooms, teams);
    }
}