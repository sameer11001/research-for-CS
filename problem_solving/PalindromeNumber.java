public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(new PalindromeNumber().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
