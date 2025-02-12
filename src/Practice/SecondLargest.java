package Practice;

public class SecondLargest {
    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLarge = -1;
        for (int element : arr) {
            if (element > largest) {
                secondLarge = largest;
                largest = element;
            } else if (element < largest && element > secondLarge) {
                secondLarge = element;
            }
        }
        return secondLarge;
    }
}
