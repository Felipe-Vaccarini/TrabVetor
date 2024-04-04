package com.example.trabvetor;

public class Vetor06 {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int soma = calcularSoma(vetor);

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }

    public static int calcularSoma(int[] vetor) {
        int soma = 0;

        for (int elemento : vetor) {
            soma += elemento;
        }

        return soma;
    }
}
