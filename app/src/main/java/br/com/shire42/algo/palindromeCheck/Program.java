package br.com.shire42.algo.palindromeCheck;

import java.util.Arrays;

public class Program {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int rigth = str.length() - 1;

        while((left != rigth)) {
            if(left - rigth == 1)
                return true;

            if(str.charAt(left) != str.charAt(rigth))
                return false;

            left += 1;
            rigth -= 1;
        }

        return true;
    }

}
