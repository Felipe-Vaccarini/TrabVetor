package com.example.trabvetor;

public class Vetor09 {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int menorElemento = encontrarMenorElemento(vetor);

        System.out.println("O menor elemento do vetor é: " + menorElemento);
    }

    public static int encontrarMenorElemento(int[] vetor) {
        int menorElemento = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }
        return menorElemento;
    }
}


