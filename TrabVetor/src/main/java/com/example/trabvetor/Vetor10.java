package com.example.trabvetor;

public class Vetor10 {
    public static void main(String[] args) {

        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        System.out.print("Elementos do vetor na ordem inversa: ");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
