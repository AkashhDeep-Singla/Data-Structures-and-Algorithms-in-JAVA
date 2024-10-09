package Test;

import java.util.Scanner;

public class ObsessionLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a message:");
        String msg = scan.nextLine();
        System.out.println("Enter Name:");
        String name = scan.next();
        int ans = obsession(name, msg);
        System.out.println(ans);
    }

    public static int obsession(String name, String msg) {
        String[] arr = msg.split(" ");
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals(name)) {
                count ++;
            }
        }
        return count;
    }
}
