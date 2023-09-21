package org.example.utils;

public class Util {
    public static void checksNegativeNumbers(int value){
        if (value<0) throw new IllegalArgumentException("O valor não pode ser nagativo");
    }
}
