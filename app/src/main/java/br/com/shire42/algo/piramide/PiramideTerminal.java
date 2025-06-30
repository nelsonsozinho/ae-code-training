package br.com.shire42.algo.piramide;

public class PiramideTerminal {

    public void print(int spaces) {

        for(int i = 0; i < spaces; i++ ) {
            for(int j = spaces - i; j>1; j--) {
                System.out.println(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        PiramideTerminal piramide = new PiramideTerminal();
        piramide.print(5);
    }

}

