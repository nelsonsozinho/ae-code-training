package br.com.shire42.foobar.reverArray;

public class Program {

    public int[] solution(int[] input) {
        int pointer = input.length - 1;

        for(int i=0;i<input.length;i++) {
            if(pointer == i)
                break;

            int tmp = input[pointer];
            input[pointer] = input[i];
            input[i] = tmp;

            pointer--;
        }

        return input;
    }

}
