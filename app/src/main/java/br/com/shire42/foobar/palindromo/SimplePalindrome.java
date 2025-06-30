package br.com.shire42.foobar.palindromo;

public class SimplePalindrome {

    //civic

    public boolean isPalindrome(String word) {
        char[] wordArray = word.toCharArray();

        int front = 0;
        int tail = wordArray.length - 1;

        while(front < tail) {
            if(wordArray[front] != wordArray[tail]) {
                return false;
            }

            front += 1;
            tail -= 1;

        }

        return true;
    }

}
