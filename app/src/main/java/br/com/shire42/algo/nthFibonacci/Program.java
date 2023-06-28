package br.com.shire42.algo.nthFibonacci;

public class Program {

    public static int getNthFib(int n) {
        if(n == 1)
            return 0;

        return walk(n, 1, 0, 0);
    }

    private static int walk(int n, int paths, int before, int next) {
        paths+=1;

        if(next == 0)
            next+=1;

        if(paths >= n)
            return next;

        int tmp = next;
        next = before + next;
        before = tmp;

        return walk(n, paths, before, next);
    }

}
