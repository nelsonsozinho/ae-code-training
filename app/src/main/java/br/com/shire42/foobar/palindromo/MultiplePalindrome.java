package br.com.shire42.foobar.palindromo;

public class MultiplePalindrome {

    //input abaadd
    //output aba

    //input abba
    //output bb

    public String solution(String input) {
        if(input == null || input.isBlank()) {
            return "";
        }

        char[] inputChars = input.toCharArray();
        StringBuilder checko = new StringBuilder();
        int next = 0;

        for(int i=0;i<inputChars.length;i++) {
            next += 1;
            checko.append(inputChars[i]);
            while(next < inputChars.length) {
                checko.append(inputChars[next]);
                if(isPalindrome(checko)) {
                    return checko.toString();
                }
                next += 1;
            }
            next = i+1;
            checko = new StringBuilder();
        }

        return "";
    }

    private boolean isPalindrome(StringBuilder input) {
        char[] inputChar = input.toString().toCharArray();
        int tail = inputChar.length - 1;
        for(int i=0;i<inputChar.length;i++) {
            if(inputChar[i] != inputChar[tail]) {
                return false;
            }
            tail -= 1;
        }

        return true;
    }

}
