package br.com.shire42.algo.zerosRightSide;


public class ZerosRightSide {

    //[0, 1, 0, 3, 12]
    //[1, 3, 12, 3,12 ]
    public int[] solution(int[] input) {
        int insertPosition = 0;

        for(int i=0;i<input.length;i++) {
            if(input[i] != 0) {
                input[insertPosition] = input[i];
                insertPosition += 1;
            }
        }

        while(insertPosition < input.length) {
            input[insertPosition] = 0;
            insertPosition += 1;
        }

        return input;
    }

    public static void main(String...args) {
        ZerosRightSide solution = new ZerosRightSide();
        int[] input = {0, 1, 0, 3, 12};
        int[] result = solution.solution(input);
        System.out.println(result);
    }

}
