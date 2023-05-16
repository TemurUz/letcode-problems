package uz.tioma.search;

import java.util.Date;
import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = BinarySearch.getArray();
        simpleSearch(arr, 60);
        System.out.println("2 - " + new Date().getTime());
    }

    public static int simpleSearch(int[] arr, int searchNumber) {
        System.out.println("1 - " + new Date().getTime());
        for (int j : arr) {
            if (searchNumber == j)
                return searchNumber;
        }
        return 0;
    }
}
