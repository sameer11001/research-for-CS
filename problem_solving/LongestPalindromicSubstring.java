
public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        System.out.println();
    }

    public int start = 0;
    public int end = 0;

    private void palindrome(char[] ch, int i) {
        int l = i;
        int r = i;
        int n = ch.length;
        if (i >= n - 1)
            return;
        while (r < n - 1 && ch[r] == ch[r + 1]) {
            r++;
        }
        i = r;
        while (l > 0 && r < n - 1 && ch[l - 1] == ch[r + 1]) {
            l--;
            r++;
        }
        if ((end - start) < (r - l)) {
            end = r;
            start = l;
        }
        palindrome(ch, i + 1);
    }

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        palindrome(ch, 0);
        return s.substring(start, end + 1);
    }
}

// public static String longestPalindrome(String s) {

// if (s == null || s.length() == 0) {
// return "";
// }

// int start = 0;
// int end = 0;
// String stringTemp = "";
// String result = "";
// for (start = 0; start < s.length(); start++) {
// for (end = s.length() - 1; end >= 0; end--) {
// if (isPalindrome(s, start, end)) {
// stringTemp = s.substring(start, end + 1);
// break;
// }
// }
// if (stringTemp.length() > result.length()) {
// result = stringTemp;

// }
// }
// return result;
// }

// public static boolean isPalindrome(String s, int start, int end) {
// while (start < end) {
// if (s.charAt(start) != s.charAt(end)) {
// return false;
// }
// start++;
// end--;
// }
// return true;
// }
