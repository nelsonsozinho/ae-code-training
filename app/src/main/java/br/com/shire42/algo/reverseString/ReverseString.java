package br.com.shire42.algo.reverseString;

public class ReverseString {

    public void reverseString(char[] s) {
        int begin = 0;
        int end = s.length - 1;

        while(begin < end) {
            char tmp = s[begin];
            s[begin] = s[end];
            s[end] = tmp;
            begin+=1;
            end-=1;
        }

    }


    public static void main(String...args) {
        ReverseString reverseString = new ReverseString();
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(input);
        System.out.println(input);
    }

}
