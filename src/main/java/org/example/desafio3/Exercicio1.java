package org.example.desafio3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma posicao: ");
        int value = scanner.nextInt();
        int calculatesFibonnaci = calculatesFibonnaci(value);

        System.out.println("N = "+value+ "=> saida Fib = "+calculatesFibonnaci);

    }
    public static int calculatesFibonnaci(int n){
        if (n<2 ) return n;
        int[] fibonacciSeries = new int[n+1];

        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        IntStream.range(2, n+1).forEach(i -> {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        });
        return fibonacciSeries[n];
    }
}
