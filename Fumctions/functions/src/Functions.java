import java.util.*;

public class Functions {

    static Scanner reader = new Scanner(System.in);

    public static void input(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter num: ");
            int x = reader.nextInt();
            a[i] = x;
        }
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public static double average(int[] a){
        int s = 0;
        for (int j : a) {
            s += j;
        }
        return s / a.length;
    }

    public static void above_avg(int[] a, double f){
        for (int j : a) {
            if (j > f) {
                System.out.println(j + " is above average");
            }
        }
    }

    public static void largest(int[] a){
        int z = a[0];
        int zi = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > z) {
                z = a[i];
                zi = i;
            }

        }
        System.out.println("The largest number was: " + z + " and the index was: " + zi);
    }

    public static boolean all_even(int[] a){
        for (int j : a) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int num_even(int[] a){
        int m = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                m++;
            }
        }
        return m;
    }

    public static boolean equal_gap(int[] a){
        int x = a[0], y = a[1], z = y-x;
        for (int i = 1; i < a.length - 1; i++){
            x = a[i];
            y = a[i+1];
            if (x + z != y){
                return false;
            }
        }
        return true;
    }

    public static void print_array(int[] a){
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void fusion_array(int[] a, int[] b, int[] c){
        for (int i = 0; i < a.length; i++){
            c[i] = Math.max(a[i], b[i]);
        }
        print_array(c);
    }

    public static int largest_even(int[] a){
        int max = -1;
        for (int j : a) {
            if (j > max && j % 2 == 0) {
                max = j;
            }
        }
        return max;
    }

    public static boolean palindrom(int[] a){
        int x = 0, y = a.length - 1;
        while (x>y){
            //noinspection ConstantConditions
            if (a[x] != a[y]){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public static int[] reverse_array(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.max(a[i], b[i]);
        }
        return b;
    }


    public static boolean is_reversed(int[] a, int[] b){
        int[] c = reverse_array(a);
        return b == c;
    }


    public static boolean is_reversed2(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[a.length-1-i] = a[i];
        }

        for (int i = 0; i < a.length; i++){
            if (b[i] != c[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean num_in_array(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }

    public static boolean palindrom2(int[] a){
        for (int i = 0; i < a.length; i++){
            if (a[i] != a[a.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean rising_order(int[] a){
        int x, y;
        for (int i = 0; i < a.length - 1; i++){
            x = a[i];
            y = a[i+1];
            if (!(x < y)){
                return false;
            }
        }
        return true;
    }

    public static int num_in_array_of_num(int[] a, int b){
        int m = 0;
        for (int j : a) {
            if (j == b) {
                m++;
            }
        }
        return m;
    }

    public static int num_num(int w) {
        int s=1;
        int o=w%10;
        w/=10;
        while(w>0){
            int x=w%10;
            if(x==o){
                s++;
            }
            w/=10;
        }
        return s;
    }

    public static int prime(int a)
    {
        int s=0;
        while (a>0)
        {
            int k=a%10;
            a=a/10;
            int x=a%10;
            if (x >= k) {
                s = 1;
            }
        }
        return s;
    }

    public static int last(int a)
    {
        int s=0;
        for (int i=2; i<a; i++)
        {
            if(a%i==0)
            {
                s++;
            }
        }
        return s;
    }

    public static int even_digits(int w) {
        int s=0;
        while(w>0){
            int x=w%10;
            if(x%2==0){
                s++;
            }
            w/=10;
        }
        return s;
    }

    public static int num_num2(int w) {
        int s = 0;
        for (int i = 2; i < w; i++) {
            if (w % i == 0) {
                s++;
            }
        }
        return s;
    }

    public static boolean allDigitsOdd( int x) {
        while (x>0) {
            int y = x % 10;
            if (y % 2 != 0) {
                return false;
            }
            x/=10;
        }
        return true;
    }

    public static int digit_in_num(int x, int y) {
        int m = 0, a;
        while (x>0) {
            a = x%10;
            if (y == a){
                m++;
            }
            x /= 10;
        }
        return m;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int modulu(int x, int y) {
        while (x>=y) {
            x -= y;
        }
        return x;
    }

    public static int phiboLocation(int x) {
        int a = 0, b = 1, c = 0;

        for(int i = 1; i < x; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int power(int a, int b) {
        int power = a;
        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }

    public static boolean is_in(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }
    public static void all_in(int[] a, int[] b){
        for (int i = 0; i < b.length; i++){
            if (!(is_in(b ,a[i]))){
                System.out.println(a[i]);
            }
        }
    }

    public static int times_in(int a, int b){
        int m = 0;
        while (a>0){
            if (a == b){
                m++;
            }
            a /= 10;
        }
        return m;
    }

    public static int times_in_array(int[] a, int b){
        int m = 0;
        for (int j : a) {
            if (times_in(j, b) > 0) {
                m++;
            }
        }
        return m;
    }

    public static void digit_not_in(int[] a){
        for (int i = 0; i < 10; i++){
            if (times_in_array(a, i) < 1){
                System.out.println(i);
            }
        }
    }

    public static int left_digit(int a){
        int x = a % 10;
        while (a > 0){
            a /= 10;
            x = a % 10;
        }
        return x;
    }

    public static int right_digit(int a){
        return a % 10;
    }

    public static boolean symmetry(int[] a){
        int x, y;
        for (int i = 0; i < a.length - 1; i++){
            x = left_digit(a[i]);
            y = right_digit(a[i+1]);
            if (x != y){
                return false;
            }
        }
        return true;
    }

    public static boolean is_inB(int[] a, int b){
        for (int j : a) {
            if (j == b) {
                return true;
            }
        }
        return false;
    }
    public static boolean all_inB(int[] a, int[] b){
        for (int i = 0; i < b.length; i++){
            if (!(is_in(b ,a[i]))){
                return false;
            }
        }
        return true;
    }

    public static boolean double_all_in(int[] a, int[] b){

        return all_inB(a, b) && all_inB(b, a);
    }

    public static int digit_not_inI(int[] a){
        int m = 0;
        for (int i = 0; i < 10; i++){
            if (times_in_array(a, i) < 1){
                m++;
            }
        }
        return m;
    }

    public static boolean digit_all_in(int[] a){

        return digit_not_inI(a) < 1;
    }


    public static boolean no_reapiting(int x){
        for (int i = 0; i <= 9; i++){
            if (digit_in_num(x, i) > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalDigits(int x, int y) {
        while(x>0) {
            int a = x % 10;
            //noinspection SuspiciousNameCombination
            boolean k = digit_in_num(y, a) > 0;
            if (!k) {
                return false;
            }
            x /= 10;

        }
        return true;
    }

    public static void dividers(int x) {
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void is_there_larger(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a.length; j++){
                if (a[i] < a[j]){
                    System.out.println("The number " + a[i] + " is not larger then all of the following numbers in the array");
                }
                else {
                    System.out.println("The number " + a[i] + " is larger then all of the following numbers in the array");
                }
            }
        }
    }

    public static boolean is_there_largerB(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    public static int max_index(int[] a, int i, int j)
    {
        if (a[i] >= a[j])
        {
            return i;
        }
        else if (a[j] > a[i])
        {
            return j;
        }
        return -1;
    }

    public static int min_index(int[] a, int i, int j)
    {
        if (a[i] >= a[j])
        {
            return j;
        }
        else if (a[j] > a[i])
        {
            return i;
        }
        return -1;
    }

    public static void order(int[] a)
    {
        while (!(is_there_largerB(a)))
        {
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < a.length; j++)
                {
                    if (min_index(a, i, j) == j && j > i)
                    {
                        switch_places(a, i, j);
                    }
                }
            }
        }
    }

    public static void switch_places(int[] a, int i, int j)
    {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    public static int mid(int[] a){
        order(a);
        return a[(a.length + 1) / 2];
    }

    public static int char_is_in(String x, char y) {
        int z = 0;
        for (int i = 0; i < x.length(); i++){
            if (y == x.charAt(i)) {
                z++;
            }
        }
        return z;
    }

    public static boolean char_is_inb(String x, char y) {
        for (int i = 0; i < x.length(); i++){
            if (y == x.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static int digit_in_both(int a, int b)
    {
        int e=0,t=0;
        int c=a;
        int d=b;
        while(a>0)
        {
            e++;
            a=a/10;
        }
        for(int i=1; i<=e; i++)
        {
            b=d;
            int x=c%10;
            int xx=b%10;
            c=c/10;
            while(b>0)
            {
                if(x==xx)
                    t=t*10+x;
                b=b/10;
                xx=b%10;
            }
        }
        return t;
    }

    public static boolean all_chars_same(String x) {
        char y = x.charAt(0);
        for (int i = 1; i < x.length();i++) {
            if (y != x.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void all_chars(String x) {
        for (int i = 0; i < x.length();i++) {
            System.out.println(x.charAt(i));
        }
    }

    public static int all_in(String y, int x){
        x --;
        int m = 1;
        while(x<y.length() - 1 && y.charAt(x) == y.charAt(x+1)){
            m++;
            x++;
        }
        return m;
    }

    public static void longest_strike(String y) {
        int m1=0, m2, mfinal=0;
        for (int i = 1; i < y.length();i++) {
            m2 = all_in(y, i);
            mfinal = Math.max(m2, m1);
            m1 = m2;
        }
        System.out.println(mfinal);
    }

    public static double square2(int x){
        double l=0, r=x, m=-1, y;
        while ((r-l) > 0.00001){
            m = (l+r)/2;
            y = (m*m) - x;
            if (y > 0){
                r = m;
            }
            else if (y < 0) {
                l = m;
            }
            else {
                return m;
            }
        }

        return m;
    }

    public static double square(int x){
        double l=0, r=x, m=-1, y;
        while ((r-l) > 0.00001){
            m = (l+r)/2;
            y = (m*m) - x;
            if (y > 0){
                r = m;
            }
            else if (y < 0) {
                l = m;
            }
            else {
                return m;
            }
        }

        return m;
    }

    public static int common(int x, int y){
        while(x != y){
            if (y > x)
                y -= x;
            else if (x > y)
                x -= y;
        }
        return y;
    }

    public static void bubble_sorting(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int k = 0; k < a.length - 1 - i; k++)
            {
                if (a[k] > a[k + 1])
                {
                    int z = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = z;
                }
            }
        }
    }

    public static void random_vote(int[] a)
    {
        int x;
        for (int i = 1; i <= 300; i++)
        {
            x = (int)(Math.random() * 10 + 1);
            switch (x) {
                case 1 -> a[0]++;
                case 2 -> a[1]++;
                case 3 -> a[2]++;
                case 4 -> a[3]++;
                case 5 -> a[4]++;
                case 6 -> a[5]++;
                case 7 -> a[6]++;
                case 8 -> a[7]++;
                case 9 -> a[8]++;
                case 10 -> a[9]++;
                default -> System.out.println("Your vote doesn't count. You voted a wrong vote");
            }
        }
    }

    public static int largest_location(int[] a)
    {
        int x = 0;
        //noinspection LoopStatementThatDoesntLoop
        while(true)
        {
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[x])
                {
                    x = i;
                }
            }
            break;
        }
        return x;
    }

    public static void vote(int[] a)
    {
        int x;
        for (int i = 1; i <= 300; i++)
        {
            System.out.println("Enter 1-10: ");
            x = reader.nextInt();
            switch (x) {
                case 1 -> a[0]++;
                case 2 -> a[1]++;
                case 3 -> a[2]++;
                case 4 -> a[3]++;
                case 5 -> a[4]++;
                case 6 -> a[5]++;
                case 7 -> a[6]++;
                case 8 -> a[7]++;
                case 9 -> a[8]++;
                case 10 -> a[9]++;
                default -> System.out.println("Your vote doesn't count. You voted a wrong vote");
            }
        }
    }



    public static void input_zero(int[] a)
    {
        Arrays.fill(a, 0);
    }

    public static void board(int[] a){
        input_zero(a);
        vote(a);
        print_array(a);

        int x;
        for (int i = 1; i <= 5; i++){
            x = largest_location(a);
            System.out.println(x);
            a[x] = -1;
        }
    }

    public static void bigger_series(int st1, int st2, int in1, int in2){
        int  m = 0;
        while(st1 >= st2){
            st1 += in1;
            st2 += in2;
            m++;
            System.out.println(st1 + " " + st2);
        }
        System.out.println(m);
    }

    public static int in_num(int x, int digit){
        int m = 0, y;
        while (x > 0) {
            y = x % 10;
            x /= 10;
            if (digit == y) {
                m++;
            }
        }
        return m;
    }
    public static void same_edge_no_mid() {
        for (int i = 1000; i <= 9999; i++){
            int x = i % 10;
            if (x == left_digit(i) && in_num(i, x) == 2){
                System.out.println(i);
            }
        }
    }
    public static int digits(int x){
        int m = 0;
        while (x > 0) {
            m++;
            x /= 10;
        }
        return m;
    }

    public static int power_ten(int n) {
        int power_ten = 1;
        for (int i = 1; i < n; i ++){
            power_ten *= 10;
        }
        return power_ten;
    }

    public static int move(int a){
        int digits = digits(a);
        int power_ten = power_ten(digits), x = a % 10, result;
        int an = (a - x) / 10;

        result = x * power_ten + an;

        return result;
    }

    public static boolean is_moved(int a, int b){
        int x = digits(a), w = a;
        for (int i = 1; i <= x; i++){
            w = move(w);
            if (w == b){
                return true;
            }
        }
        return false;
    }

    public static void merge(int[] a, int[] b, int[] c){
        int ia = 0, ib = 0, ic = 0;
        while(ia < a.length && ib < b.length)
        {

            if (a[ia] > b[ib]){
                c[ic] = b[ib];
                ib++;
            }
            else
            {
                c[ic] = a[ia];
                ia++;
            }
            ic++;

            if (ia == a.length){
                while (ic < c.length){
                    c[ic] = b[ib];
                    ib ++;
                    ic++;
                }
            }
            else if (ib == b.length){
                while (ic < c.length){
                    c[ic] = a[ia];
                    ia ++;
                    ic++;
                }
            }

        }
        print_array(c);
    }

    public static int [] all_left_small(int[] a){
        boolean k = true;
        int x = 0;
        int[] b = new int[a.length];
        for (int i = 1; i < a.length -1; i++)
        {
            for (int j = 0; j < i; j++ ){
                if (a[j] > a[i]){
                    j = i;
                    k = false;
                }
            }
            if (k){
                b[x] = a[i];
                x ++;
            }
        }
        return b;
    }

    public static int [] all_right_larger(int[] a){
        boolean k = true;
        int x = 0;
        int[] b = new int[a.length];
        for (int i = 1; i < a.length -1; i++)
        {
            for (int j = i; j < a.length; j++ ){
                if (a[j] < a[i]){
                    j = i;
                    k = false;
                }
            }
            if (k){
                b[x] = a[i];
                x ++;
            }
        }
        return b;
    }

    public static void middle_num(int [] a){
        int [] b = all_left_small(a);
        int [] c = all_right_larger(a);

        for (int j : a) {
            if (num_in_array(b, j) && num_in_array(c, j)) {
                System.out.println(j);
            }
        }
    }

    public static void num_receiver(int[] a)
    {
        input_zero(a);
        int x = 0;
        a[0] --;
        while(x != -1)
        {
            System.out.println("Enter a number: ");
            x = reader.nextInt();
            for (int i = 0; i < 10; i++)
            {
                a[i] += digit_in_num(x, i);
            }
        }
    }

    public static void amounts_of_digits_in_input(int[] a)
    {
        num_receiver(a);
        int x, y;
        for (int i = 0; i < 10;i ++)
        {
            y = max_place(a);
            x = a[y];
            a[y] = -1;
            System.out.println(y + " : " + x);
        }
    }

    public static void sum_of_strikes(int[] a){
        int m = 0;
        for (int j : a) {
            if (j != 0) {
                m += j;
            } else {
                System.out.println(m);
                m = 0;
            }
        }
    }

    public static void largest_in_strikes(int[] a){
        int m = 0;
        for (int j : a) {
            if (j != 0) {
                m = Math.max(m, j);
            } else {
                System.out.println(m);
                m = 0;
            }
        }
    }

    public static void strike_rising(int[] a){
        boolean m = true;
        int z = 0, i = 1;
        while (i < a.length){
            while (a[i] != 0) {
                if (a[i] <= a[i-1]){
                    m = false;
                }
                i++;
            }
            if (m){
                z++;
            }
            m = true;
            i++;
        }
        System.out.println(z);
    }

    public static int palindrom_center_len(int[] a, int x){
        int m = 1, z = 1;
        while(x-z >= 0 && x+z <= a.length && a[x-z] == a[x+z]){
            m += 2;
            z++;
        }
        return m;
    }

    public static void palindrom_print(int[] a, int x){
        int m = palindrom_center_len(a, x), z = x - (m-1) / 2, z2 = x + (m-1) / 2,pali = 0;
        for (int i = z; i < z2; i++){
            pali += a[i];
        }
        System.out.println(pali);
    }

    public static int first_even(int[] a){
        for (int i = 0; i < a.length;i++){
            if (a[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    public static int last_odd(int[] a){
        for (int i = a.length - 1; i >= 0;i--){
            if (a[i] % 2 != 0){
                return i;
            }
        }
        return -1;
    }

    public static void order_even_odd(int[] a){
        int ez = first_even(a), e = last_odd(a);
        if (first_even(a) == -1 || last_odd(a) == -1){
            ez = e;
        }
        while (ez < e){
            switch_places(a, ez, e);
            ez = first_even(a);
            e = last_odd(a);
        }
        print_array(a);
    }

    public static int longest_palindrom_len(int[] a){
        int m = 0;
        for (int i = 0; i< a.length; i++){
            m = Math.max(palindrom_center_len(a, i), m);
        }
        return m;
    }

    public static void longest_palindrome_print(int[] a){
        int z, x;
        for (int i = 0; i < a.length; i++){
            z = palindrom_center_len(a, i);
            x = longest_palindrom_len(a);
            if (z  ==  x){
                palindrom_print(a, z);
            }
        }
    }

    public static void equal_sum_following(int[] a)
    {
        int sum = 0, x = 1;
        for (int i = 0; i < a.length;i++)
        {
            while (sum < a[i] && i + x <  a.length)
            {
                sum += a[i+x];
                x ++;
                if (a[i] == sum)
                {
                    System.out.println(a[i]);
                }
            }
            x = 1;
            sum = 0;
        }
    }

    public static boolean is_gcd(int[] a, int x){
        int s = 1;
        for (int j : a){
            s *= j;
            if (!(is_prime(j))){
                return false;
            }
        }
        if (s != x) {
            return false;
        }
        return true;
    }

    public static boolean is_prime(int x){
        x = Math.abs(x);
        for (int i = 2; i < x; i++){
            if (x%i == 0){
                return false;
            }
        }
        for (int i = 2; i < x; i++){
            if (x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean is_gcd_partial(int[] a, int x){
        int s;
        for (int i : a) {
            for (int k : a) {
                s = k * i;
                if (is_prime(k) && is_prime(i) && s == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int days_between(int[] w, int x, int y, int a, int b){
        int s = 0;
        s += w[y-1] - x;
        for (int i = y; i < b-1; i++){
            s += w[i];
        }
        s += a;
        return s;
    }

    public static boolean is_gcd_and_partial(int[] a, int[] b){
        int m = 0, z = 0;
        for (int j : a) {
            if (is_gcd(b, j)) {
                m++;
            }
            if (is_gcd_partial(b, j)) {
                z++;
            }
        }
        if (m+z == a.length && m == 1){
            return true;
        }
        return false;
    }

    public static void input2D(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter num: ");
                int x = reader.nextInt();
                a[i][j] = x;
            }
        }
    }

    public static void print2Darray(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input2D_random(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                int x = (int)(Math.random() * 9 + 1);
                a[i][j] = x;
            }
        }
    }

    public static int sum2Darray(int[][] a){
        int m = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                m += a[i][j];
            }
        }
        return m;
    }

    public static void sum_row2Darray(int[][] a){
        int m = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                m += a[i][j];
            }
            System.out.println(m);
            m = 0;
        }
    }

    public static int largest_row_sum_2D(int[][] a){
        int m = 0, max = 0, z = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                m += a[i][j];
                if (m > max){
                    z = i;
                }
                max = Math.max(max, m);
            }
            m = 0;
        }
        return z;
    }

    public static void minus_one(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] < a[i][j+1]){
                    a[i][j] = -1;
                }
            }
        }
    }

    public static void diagnle(int[][] a){
        for (int i = 0; i < a.length; i ++){
            System.out.println(a[i][i]);
        }
    }

    public static void diagnle_2(int[][] a){
        for (int i = a.length - 1; i >= 0; i --){
            System.out.println(a[i][i]);
        }
    }

    public static int max_place(int[] a)
    {
        int max_num = a[0];
        int max_index=0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max_num)
            {
                max_num = a[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public static int min_place(int[] a)
    {
        int min_num = a[0];
        int min_index=0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < min_num)
            {
                min_num = a[i];
                min_index = i;
            }
        }
        return min_index;
    }


    public static void balance(int[] a){
        int y = max_place(a), x = min_place(a);
        while (a[y] - a[x] > 1){
            a[y] = a[y] - 1;
            a[x] = a[x] + 1;
            y = max_place(a);
            x = min_place(a);
        }
    }

    public static void sum_colum2Darray(int[][] a){
        int m = 0;
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a.length; j++) {
                m += a[j][i];
            }
            System.out.println(m);
            m = 0;
        }
    }

    public static int largest_colum_sum_2D(int[][] a){
        int m = 0, max = 0, z = 0;
        for (int i = 0; i < a[0].length; i++){
            for (int j = 0; j < a.length; j++) {
                m += a[j][i];
                if (m > max){
                    z = j;
                }
                max = Math.max(max, m);
            }
            m = 0;
        }
        return z;
    }

    public static void minus_1(int[][] a){
        for (int i = 0; i < a[0].length - 1; i++){
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] < a[j][i+1]){
                    a[j][i] = -1;
                }
            }
        }
    }
    
    public static int sum_row(int[][] a, int x){
        int m = 0;
        for (int i = 0; i < a[x].length; i++){
            m += a[x][i];
        }
        return m;
    }

    public static void switch_rows(int[][] a, int x, int y){
        int z;
        for (int i = 0; i < a[x].length; i++){
            z = a[x][i];
            a[x][i] = a[y][i];
            a[y][i] = z;
        }
    }

    public static void sort_rows(int[][] a){
        int m = 1, c, b;
        while (m != 0){
            m = 0;
            for (int i = 0; i < a.length - 1; i ++){
                b = sum_row(a, i);
                c = sum_row(a, i+1);
                if (b > c){
                    switch_rows(a, i, i+1);
                    m++;
                }
            }
        }
    }

}
