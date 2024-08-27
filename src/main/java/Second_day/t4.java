package Second_day;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class t4 {

    public static void main(String[] args) {
        int[] list = {1, 2, 32, 3, -3, 3, 4, 5};
        bubbleSort(list);
        int[][] lista = checksome(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(lista[i][j] + " ");

            }
            System.out.println("");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    public static int[][] checksome(int[] arr){
        int n = arr.length;
        int m = 2;
        int[][] res = new int[n][m];
        for (int i = 1; i < n; i++) {
            if (arr[i-1] == arr[i]) {
                res[i][1] = 1;
                continue;
            }
            res[i][0] = arr[i];
            res[i][1] = 0;
        }
        return res;
    }



}
