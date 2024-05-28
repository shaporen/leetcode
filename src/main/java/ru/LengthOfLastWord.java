package ru;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    return count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord llw = new LengthOfLastWord();
        System.out.println(llw.lengthOfLastWord("Hello Worlde"));
    }
}
