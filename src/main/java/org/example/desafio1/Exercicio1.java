package org.example.desafio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de valores a ser digitado: ");
            int number = scanner.nextInt();
            checksNegativeNumbers(number);
            ArrayList<Integer> numbers = readNumbers(number);
            ArrayList<Integer> organizedList = organizeList(numbers);
            organizedList.forEach(System.out::println);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

    }
    public static ArrayList<Integer> readNumbers(int lenght){
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lenght; i++) {
            System.out.println("Valor "+(i+1)+" :");
            int value = scanner.nextInt();
            checksNegativeNumbers(value);
            integers.add(value);
        }
        return integers;
    }

    public static ArrayList<Integer> organizeList(ArrayList<Integer> numbers){
        var even  = numbers.stream()
                .filter(l -> l % 2 == 0)
                .sorted().toList();
        var odd = numbers.stream()
                .filter(l -> l % 2 != 0)
                .sorted(Comparator.reverseOrder()).toList();
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);
        return result;
    }

    public static void checksNegativeNumbers(int value){
        if (value<0) throw new IllegalArgumentException("O valor não pode ser nagativo");
    }
}
