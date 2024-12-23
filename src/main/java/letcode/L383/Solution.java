package letcode.L383;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] charCounts = new int[26];

        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c - 'a'] < 0) {
                // Agar harf yetarli bo'lmasa, false qaytar
                return false;
            }
        }

        return true; // Barcha harflar mavjud bo'lsa, true qaytar
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        int n = ransomNote.length();

        for (int i = 0; i < n; i++) {
            char a = ransomNote.charAt(i);

            int matchingIndex = -1;
            for (int j = 0; j < magazine.length(); j++) {
                if (a == magazine.charAt(j)) {
                    matchingIndex = j;
                    magazine = magazine.substring(0, j) + magazine.substring(j + 1);
                    break;
                }
            }
            if (matchingIndex == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baaccc";
        Solution solution = new Solution();
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }
}
