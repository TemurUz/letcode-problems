package letcode.search;

import java.util.Date;

public class BinarySearch {
    public static void main(String[] args) {


        int[] arr = getArray();;
        int x = 60;
        int result = binarySearch(arr, x);
        System.out.println("2 - " + new Date().getTime());
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + arr[result]);
    }

    static int [] getArray() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 115,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
                32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
                48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 49, 60, 61, 62};
    }

    public static int binarySearch(int[] arr, int key){
        System.out.println("1 - " + new Date().getTime());
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key)
                return m;
            if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
