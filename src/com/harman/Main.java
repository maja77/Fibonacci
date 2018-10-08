package com.harman;

import java.util.*;


public class Main {

    // n liczb ciagu Fibonacciego przy zalozeniu ze ciag zaczyna sie od zera


    // inkrementacyjnie
    private static List<Integer> fibonacciInc(int number){
        int x = 0;
        int y = 1;
        List<Integer> fibonacciInc = new ArrayList<>();
        fibonacciInc.add(x);
        fibonacciInc.add(y);
        for (int i=0; i<number-2; i++) {
            int z = x + y;
            fibonacciInc.add(z);
            x = y;
            y = z;
        }
        return fibonacciInc;
    }

    // rekurencyjnie
    private static int fibonacciNumber(int number) {
        if (number==0)
            return 0;
        else if ((number==1)||(number==2))
            return 1;
        else
            return fibonacciNumber(number-1)+fibonacciNumber(number-2);
    }


    public static void main(String []argh){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("ciąg w inkrementacji: " + fibonacciInc( number));

        List<Integer> fibonacciRec = new ArrayList<>();
        for (int n=0; n<number; n++) {
            fibonacciRec.add(fibonacciNumber(n));
        }
        System.out.println("ciąg w rekurencji:   " + fibonacciRec);
    }
}