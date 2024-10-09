package Practice;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        int res = fibonacci(n);
        System.out.println(n + "th fibonacci number is :");
        System.out.println(res);
    }
}
