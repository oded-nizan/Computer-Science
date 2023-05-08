public class Main 
{
    public static void printRoad(int k, int[] rooms)
    {
        while (rooms[k] != -1)
        {
            System.out.println(rooms[k]);
            k = rooms[k];
        }
        System.out.println("This team has reached the end");
    }

    public static void printRoadLen(int k, int[] rooms)
    {
        int num = 0;
        while (rooms[k] != -1)
        {
            num ++;
            k = rooms[k];
        }
        System.out.println("This group went through " + num + " rooms");
    }

    public static void printRoadDis(int k, int[] rooms)
    {
        int num = 0;
        while (rooms[k] != -1)
        {
            num += Math.abs(rooms[k] - rooms[rooms[k]]);
            k = rooms[k];
        }
        System.out.println("This group went through " + num + " rooms");
    }

    public static int returnRoadLen(int k, int[] rooms)
    {
        int num = 0;
        while (rooms[k] != -1)
        {
            num ++;
            k = rooms[k];
        }
        return num;
    }

    public static int returnRoadDis(int k, int[] rooms)
    {
        int num = 0;
        while (rooms[k] != -1)
        {
            num += Math.abs(rooms[k] - rooms[rooms[k]]);
            k = rooms[k];
        }
        return num;
    }

    public static void allRoads(int[] rooms, int[] teams)
    {
        for (int i = 0; i < teams.length; i ++)
        {
            System.out.println("Group" + " " + (i + 1) + "\n");
            printRoad(teams[i], rooms);
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static int roadEnd(int k, int[] rooms)
    {
        int end = -1;
        while (rooms[k] != -1)
        {
            k = rooms[k];
        }
        end = k;
        return k;
    }

    public static int[] roadsEnds(int[] rooms, int[] teams)
    {
        int[] arr = new int[teams.length];
        for (int i = 0; i < arr.length; i ++)
        {
            arr[i] = roadEnd(teams[i], rooms);
        }
        return arr;
    }

    public static boolean isRoadsDiff(int[] rooms, int[] teams)
    {
        int[] arr = roadsEnds(rooms, teams);
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr.length; j ++)
            {
                if (arr[i] == arr[j] && j != i)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void allRoadsLen(int[] rooms, int[] teams)
    {
        for (int i = 0; i < teams.length; i ++)
        {
            System.out.println("Group" + " " + (i + 1) + "\n");
            printRoadLen(teams[i], rooms);
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static void allRoadsDis(int[] rooms, int[] teams)
    {
        for (int i = 0; i < teams.length; i ++)
        {
            System.out.println("Group" + " " + (i + 1) + "\n");
            printRoadDis(teams[i], rooms);
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static int[] roadsLen(int[] rooms, int[] teams)
    {
        int[] arr = new int[teams.length];
        for (int i = 0; i < teams.length; i ++)
        {
           arr[i] = returnRoadLen(teams[i], rooms);
        }
        return arr;
    }

    public static int[] roadsDis(int[] rooms, int[] teams)
    {
        int[] arr = new int[teams.length];
        for (int i = 0; i < teams.length; i ++)
        {
            arr[i] = returnRoadDis(teams[i], rooms);
        }
        return arr;
    }

    public static int maxLen(int[] rooms, int[] teams, int[] arr)
    {
        int max= -1;
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr[i] >= max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void longestRoads(int[] rooms, int[] teams)
    {
        int[] arr = roadsLen(rooms, teams);
        int max = maxLen(rooms, teams, arr);
        System.out.println("The longest road is " + max);
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr[i] == max)
            {
                System.out.println("Group " + (i+1) + " has the max road len that is " + arr[i]);
            }
        }
    }

    public static void longestRoadsDis(int[] rooms, int[] teams)
    {
        int[] arr = roadsDis(rooms, teams);
        int max = maxLen(rooms, teams, arr);
        System.out.println("The longest road is " + max);
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr[i] == max)
            {
                System.out.println("Group " + (i+1) + " has the max road len that is " + arr[i]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] rooms = new int[]{18, 17, -1, -1, 8, 0, 19, 0, 1, 0, 12, 0, 13, 2, 0, 0, -1, -1, 3, 10};
        int[] teams = new int[]{4, 6, 0, 16};
        System.out.println(isRoadsDiff(rooms, teams));
    }
}