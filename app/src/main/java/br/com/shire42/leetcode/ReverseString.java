package br.com.shire42.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Input: s = "  hello world  "
// Output: "world hello"

// Input: s = "a good   example"
// Output: "example good a"
public class ReverseString {

    public String solution(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string);
        List<String> stringOutput = new ArrayList<>();
        
        while(tokenizer.hasMoreTokens()) {
            stringOutput.add(tokenizer.nextToken());
        }

        Collections.reverse(stringOutput);

        StringBuilder builder = new StringBuilder();

        for(int i=0;i<stringOutput.size();i++) {
            builder.append(stringOutput.get(i));
            if(i < stringOutput.size() - 1) {
                builder.append(" ");
            } 
        }

        return builder.toString();
    }

    public static void main(String...args) {
        ReverseString rs = new ReverseString();
        // String input = "the sky is blue";
        // String input = "  hello world  ";
        String input = "a good   example";


        String outtput = rs.solution(input);
        System.out.println(outtput);
    }

}
