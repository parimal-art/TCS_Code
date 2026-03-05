package Striver_Sheet;

import java.util.Arrays;

public class A13_1_repeatingChk {

    // Function to find repeating elements
    public void findRepeatingElements(int[] arr) {

        Arrays.sort(arr);

        System.out.print("Repeating elements: ");

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {

                System.out.print(arr[i] + " ");

                // skip duplicates
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {

        A13_1_repeatingChk sol = new A13_1_repeatingChk();

        int[] arr = {1,1,2,3,4,4,5,2};

        sol.findRepeatingElements(arr);
    }
}