package com.example.trabvetor;

public class Vetor03 {
    public static void main(String[] args) {

        int[] vetor = {1, 3, 5, 7, 9};

        System.out.print("Vetor: {");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i != vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

