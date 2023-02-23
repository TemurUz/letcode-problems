package uz.tioma.search;

import java.util.Date;
import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 115, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,49,60,61,62};
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
