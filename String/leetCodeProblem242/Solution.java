// import java.util.Arrays;

class Solution {
    // public boolean isAnagram(String s, String t) {
    // if (s.length() != t.length()) {
    // return false;
    // }

    // char sDemo[] = s.toCharArray();
    // char tDemo[] = t.toCharArray();

    // Arrays.sort(sDemo);
    // Arrays.sort(tDemo);

    // for(int i = 0; i < s.length(); i ++) {
    // if (sDemo[i] != tDemo[i]) return false;
    // }
    // return true;
    // }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int num : freq) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
