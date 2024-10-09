package Questions;

import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
        }
        bubbleSort(strings);
        System.out.println("Sorted strings:");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void bubbleSort(String[] arr) {
        int size = arr.length-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}