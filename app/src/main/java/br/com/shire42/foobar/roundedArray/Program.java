package br.com.shire42.foobar.roundedArray;

public class Program {

    public int[] roundedArray(int[] input, int  round){
        int countLoop = 0;

        int tmp = input[0];
        int aux = input[0];
        int size = input.length;

        while(countLoop < round) {
            int index = 0;
            int indexCount = 0;

            while(indexCount != size+1) {
                tmp = input[index];
                input[index] = aux;
                aux = tmp;

                index++;
                indexCount++;

                if(index == size)
                    index = 0;
            }

            countLoop+=1;
        }

        return input;
    }

}
