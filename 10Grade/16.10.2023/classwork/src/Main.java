
public class Main {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int multiply(int n, int m) {
        if (n == 0) {
            return 0;
        } else {
            return m + multiply(n - 1, m);
        }
    }

    public static int sumBetween(int n, int m) {
        if (n > m) {
            return 0;
        } else {
            return n + sumBetween(n + 1, m);
        }
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static int numDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + numDigits(n / 10);
        }
    }

    public static int numInNumber(int n, int m) {
        if (n < m) {
            return 0;
        } else {
            return 1 + numInNumber(n, m - n);
        }
    }

    public static int power(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            return n * power(n, m - 1);
        }
    }

    public static int numOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + numOfDigits(n / 10);
        }
    }

    public static int numOfEvenDigits(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + numOfEvenDigits(n / 10);
        } else {
            return numOfEvenDigits(n / 10);
        }
    }

    public static int sumOfEvenDigits(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n % 10 + sumOfEvenDigits(n / 10);
        } else {
            return sumOfEvenDigits(n / 10);
        }
    }

    public static int lastDigit(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 10) {
            return n;
        } else {
            return lastDigit(n / 10);
        }
    }

    public static int sumOfEvenNoOddDigits(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n % 10 + sumOfEvenNoOddDigits(n / 10);
        } else {
            return sumOfEvenNoOddDigits(n / 10) - n % 10;
        }
    }

    public static int digitInNumber(int n, int m) {
        if (n % 10 == m) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return digitInNumber(n / 10, m);
        }
    }

    public static boolean digitInNumberb(int n, int m) {
        if (n == 0) {
            return false;
        } else {
            return n % 10 == m || digitInNumberb(n / 10, m);
        }
    }

    public static boolean allDigitsEven(int n) {
        if (n == 0) {
            return true;
        } else if (n % 2 == 0) {
            return allDigitsEven(n / 10);
        } else {
            return false;
        }
    }

    public static boolean atleastOneDigitEven(int n) {
        if (n == 0) {
            return false;
        } else if (n % 2 == 0) {
            return true;
        } else {
            return atleastOneDigitEven(n / 10);
        }
    }

    public static boolean isPrime(int n, int i) {
        if (i == n) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return isPrime(n, i + 1);
        }
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    public static boolean allDigitsEqual(int n) {
        if (n < 10) {
            return true;
        } else {
            int x = n % 10;
            int y = (n / 10) % 10;
            if (x != y) {
                return false;
            } else {
                return allDigitsEqual(n / 10);
            }
        }
    }

    public static boolean isDescendingOrder(int n) {
        if (n < 10) {
            return true;
        } else {
            int x = n % 10;
            int y = (n / 10) % 10;
            if (x >= y) {
                return false;
            } else {
                return isDescendingOrder(n / 10);
            }
        }
    }

    public static int numDividers(int n, int i) {
        if (i == n) {
            return 0;
        } else if (n % i == 0) {
            return 1 + numDividers(n, i + 1);
        } else {
            return numDividers(n, i + 1);
        }
    }

    public static int numDividers(int n) {
        return numDividers(n, 2);
    }

    public static int largestDigit(int n) {
        if (n < 10) {
            return n;
        } else {
            return Math.max(n % 10, largestDigit(n / 10));
        }
    }

    public static int numDigitInNumber(int n, int m) {
        if (n % 10 == m) {
            return 1 + numDigitInNumber(n / 10, m);
        } else if (n == 0) {
            return 0;
        } else {
            return numDigitInNumber(n / 10, m);
        }
    }

    public static int indexDigitInNumber(int n, int m, int p) {
        if (n == 0) {
            return -1;
        } else if (n % 10 == m) {
            return p;
        } else {
            return indexDigitInNumber(n / 10, m, p + 1);
        }
    }

    public static int indexDigitInNumber(int n, int m) {
        return indexDigitInNumber(n, m, 1);
    }

    public static boolean leftDigitEqualRight(int n, int m) {
        if (n / 10 == m) {
            return true;
        } else if (n == 0) {
            return false;
        } else {
            return leftDigitEqualRight(n / 10, m);
        }
    }

    public static boolean leftDigitEqualRight(int n) {
        return leftDigitEqualRight(n, n % 10);
    }

    public static int sumDividers(int n, int i) {
        if (i == n) {
            return 0;
        } else if (n % i == 0) {
            return i + sumDividers(n, i + 1);
        } else {
            return sumDividers(n, i + 1);
        }
    }

    public static int sumDividers(int n) {
        return sumDividers(n, 1);
    }

    public static void printArray(int[] arr, int i) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            printArray(arr, i + 1);
        }
    }

    public static void printArray(int[] arr) {
        printArray(arr, 0);
    }

    public static int sumArray(int[] arr, int i) {
        if (i < arr.length - 1) {
            return arr[i] + sumArray(arr, i + 1);
        } else {
            return arr[i];
        }
    }

    public static int sumArray(int[] arr) {
        return sumArray(arr, 0);
    }

    public static double maAv1(int num, int k) {
        double sum;
        if (k == 1)
            return num;
        sum = maAv1(num / 10, k - 1) * (k - 1);
        return ((num % 10) + sum) / k;
    }

    public static double maAv2(int num, int s, int n) {
        if (num == 0)
            return s / n;
        else
            return maAv2(num / 10, s + num % 10, n + 1);
    }

    public static int evenNumArray(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        } else if (i < arr.length && arr[i] % 2 == 0) {
            return 1 + evenNumArray(arr, i + 1);
        } else {
            return evenNumArray(arr, i + 1);
        }
    }

    public static int evenNumArray(int[] arr) {
        return evenNumArray(arr, 0);
    }

    public static boolean allEvenArray(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] % 2 != 0) {
                return false;
            } else {
                return allEvenArray(arr, i + 1);
            }
        }
        return true;
    }

    public static boolean allEvenArray(int[] arr) {
        return allEvenArray(arr, 0);
    }

    public static boolean palindrome(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] != arr[arr.length - (i + 1)]) {
                return false;
            } else {
                return palindrome(arr, i + 1);
            }
        }
        return true;
    }

    public static boolean palindrome(int[] arr) {
        return palindrome(arr, 0);
    }

    public static boolean arrayInArray(int[] arr, int[] arrB, int i) {
        if (i == arrB.length) {
            return true;
        } else if (i == arr.length) {
            return false;
        } else if (arrB[i] != arrB[i]) {
            return false;
        } else {
            return arrayInArray(arr, arrB, i + 1);
        }
    }

    public static boolean arrayInArray(int[] arr, int[] arrB) {
        return arrayInArray(arr, arrB, 0);
    }

    public static boolean isPower(int a, int b, int p) {
        if (Math.pow(a, p) > b) {
            return false;
        }
        if (Math.pow(a, p) == b) {
            return true;
        } else {
            return isPower(a, b, p + 1);
        }
    }

    public static boolean isPower(int a, int b) {
        return isPower(a, b, 1);
    }

    public static int findArray(int[] arr, int p1, int p2, int k) {
        if (p1 == p2) {
            return p2;
        } else {
            int x = findArray(arr, p1, p2 - 1, k);
            if (k == 1) {
                if (arr[x] > arr[p2]) {
                    return p2;
                } else {
                    return x;
                }
            } else {
                if (arr[x] > arr[p2]) {
                    return x;
                } else {
                    return p2;
                }
            }
        }
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static void decendingOrder(int[] arr, int p1, int p2) {
        int p;
        if (p1 < p2) {
            p = findArray(arr, p1, p2, 1);
            swap(arr, p1, p);
            p = findArray(arr, p1, p2, 2);
            swap(arr, p, p2);
            p1++;
            p2--;
            decendingOrder(arr, p1, p2);
        }
    }

    public static int maxInArray(int[] arr, int left, int right) {
        int middle, max1, max2;
        if (left == right) {
            return arr[left];
        } else {
            middle = (right + left) / 2;
            max1 = maxInArray(arr, left, middle);
            max2 = maxInArray(arr, middle + 1, right);
            return Math.max(max1, max2);
        }
    }

    public static boolean commonNumInArray(int[] arr, int[] brr, int i1, int i2) {
        if (arr[i1] == brr[i2]) {
            return true;
        } else if (arr.length > i1 + 1) {
            return commonNumInArray(arr, brr, i1 + 1, i2);
        } else if (brr.length > i2 + 1) {
            return commonNumInArray(arr, brr, 0, i2 + 1);
        } else {
            return false;
        }
    }

    public static boolean commonNumInArray(int[] arr, int[] brr) {
        return commonNumInArray(arr, brr, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2, 2, 10 };
        int[] brr = new int[] { 12, 12, 14, 10 };
        System.out.println(commonNumInArray(arr, brr));
    }
}
