package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.print("Enter a number to find its prime factors: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(primeFactors(num));
    }

    static List<Integer> primeFactors(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        while(num%2 == 0) {
            factors.add(2);
            num /= 2;
        }
        for(int i=3; i<=Math.sqrt(num); i+=2) {
            while (num%i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if(num > 2) {
            factors.add(num);
        }
        return factors;
    }
}
