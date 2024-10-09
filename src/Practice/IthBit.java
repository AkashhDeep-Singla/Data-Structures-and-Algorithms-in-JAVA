package Practice;

import java.util.Scanner;

public class IthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int bit = scan.nextInt();
        int answer = bitCkeck(num, bit);
        System.out.println(answer);
    }

    public static int bitCkeck(int num, int bit) {
        int mask = 1 << bit-1;
        int andBits =  num & mask;
        return andBits >> bit-1;
    }
}

// Set ith bit -> OR with the mask
// Reset ith bit -> AND with the mask
