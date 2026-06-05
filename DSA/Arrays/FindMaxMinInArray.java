// Problem: Find Max/Min in Array

public class FindMaxMinInArray {

    public static void findMaxMin(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }

    public static void main(String[] args) {

        int[] test1 = {5, 2, 8, 1, 9};
        findMaxMin(test1);

        int[] test2 = {-3, -10, -1, -7};
        findMaxMin(test2);

        int[] test3 = {100};
        findMaxMin(test3);
    }
}