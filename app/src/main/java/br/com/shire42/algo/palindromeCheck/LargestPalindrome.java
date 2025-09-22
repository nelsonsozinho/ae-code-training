package br.com.shire42.algo.palindromeCheck;

public class LargestPalindrome {

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }

        String longest = "";

        for(int i=0;i<s.length();i++) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i+1);
        }

        return null;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < toString().length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String...args) {

    }

}
