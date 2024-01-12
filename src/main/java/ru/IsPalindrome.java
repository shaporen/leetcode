package ru;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        System.out.println(ip.isPalindrome(53535));
    }
}
