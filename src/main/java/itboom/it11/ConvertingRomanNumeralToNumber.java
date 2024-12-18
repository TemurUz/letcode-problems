package itboom.it11;

public class ConvertingRomanNumeralToNumber {
    public static void main(String[] args) {
        String romanNumeral = "DCCCXXVIII";
        System.out.println(romanToInt(romanNumeral));
    }

    public static int romanToInt(String roman) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int num = 0;
        int i = 0;

        while (!roman.isEmpty()) {
            if (roman.startsWith(symbols[i])) {
                num += values[i];
                roman = roman.substring(symbols[i].length());
            } else {
                i++;
            }
        }

        return num;
    }
}
