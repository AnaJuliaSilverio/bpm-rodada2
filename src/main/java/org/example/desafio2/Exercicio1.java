package org.example.desafio2;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor :");
        int value = scanner.nextInt();
        Date date = convertNumberToDate(value);
        String formatted = formatDate(date);
        System.out.println(formatted);
    }
    public static Date convertNumberToDate(int seconds){
        long millis = seconds * 1000L;
        return new Date(millis);
    }
    public static String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss", java.util.Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat.format(date);
    }

}
