package br.com.shire42.algo.removeDuplicates;

public class RemoveDuplicatest {

    public int solution(int[] input) {
        int count = input.length > 0 ? 1 : 0;
        int auxValue = input[0];

        for(int i=1;i<input.length;i++) {
            if(auxValue != input[i]) {
                count+=1;
                auxValue = input[i];
            }
        }
        return count;
    }

    public static void main(String...args) {
        RemoveDuplicatest solution = new RemoveDuplicatest();
        int[] input   = {0,0,1,1,1,2,2,3,3,4};
        int result = solution.solution(input);
        System.out.println(result);
    }

}
