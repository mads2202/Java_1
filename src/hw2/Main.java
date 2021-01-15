package hw2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    //task1
    public static int[] change1To0(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //task3
    public static int[] lessThen6MulriplyOn2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        return arr;
    }

    //task4
    public static int[][] fillSquareDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (i + j) == (arr.length - 1))
                    arr[i][j] = 1;
            }
        }
        return arr;
    }

    public static void showSquare(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

    //task5
    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    //task 6
    public static boolean checkBalance(int[] arr) {
        int mid = arr.length / 2;
        int loopCounter = 0;
        do {
            int leftSide = 0;
            int rightSide = 0;
            for (int i = 0; i < mid; i++) {
                leftSide += arr[i];
            }
            for (int j = mid; j < arr.length; j++) {
                rightSide += arr[j];
            }
            loopCounter++;
            if (leftSide == rightSide) {
                System.out.println(mid);
                return true;
            } else if (leftSide > rightSide) {
                mid--;
            } else {
                mid++;
            }
        } while ((mid >= 0 || mid < arr.length) && loopCounter < arr.length / 2);
        return false;
    }

    //task7
    public static int[] arrOffset(int[] arr, int offset) {
        int boofer = 0;
        if (offset > 0) {
            for (int i = 0; i < offset; i++) {
                for (int j = arr.length - 1; j > 0; j--) {
                    boofer = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = boofer;

                }
            }
        }
        else{
            for (int i = 0; i < Math.abs(offset); i++) {
                for (int j = 0; j<arr.length-1; j++) {
                    boofer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = boofer;

                }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        //task1
        int[] arr1 = {1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(change1To0(arr1)));
        //task2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
        //task3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(lessThen6MulriplyOn2(arr3)));
        //task4
        int[][] square = new int[10][10];
        showSquare(fillSquareDiag(square));
        //task5
        int[] arr4 = {1, -100, 4, 2, 110, 5, 9, 1};
        System.out.println(minElement(arr4));
        System.out.println(maxElement(arr4));
        //task6
        int[] arr5 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr5));
        // task7
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrOffset(arr6,1)));



    }
}
