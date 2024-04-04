package com.example.trabvetor;

public class Vetor07 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double media = calcularMedia(vetor);

        System.out.println("A média dos elementos do vetor é: " + media);
    }

    public static double calcularMedia(int[] vetor) {
        int soma = 0;

        for (int elemento : vetor) {
            soma += elemento;
        }

        return (double) soma / vetor.length;
    }
}

