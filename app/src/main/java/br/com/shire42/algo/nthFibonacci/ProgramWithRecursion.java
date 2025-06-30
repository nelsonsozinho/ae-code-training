package br.com.shire42.algo.nthFibonacci;

public class ProgramWithRecursion{

    public static int fibonati(int n) {
        if(n <= 1)
            return n;

        return fibonati(n-1) + fibonati(n-2);
    }

    public static void main(String... args){
        ProgramWithRecursion solution = new ProgramWithRecursion();
        System.out.println(solution.fibonati(10));
    }

}

//4 + 3 + 2 + 1
//
