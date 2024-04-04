package com.example.trabvetor;

public class Vetor08 {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};

        int maiorElemento = encontrarMaiorElemento(vetor);

        System.out.println("O maior elemento do vetor é: " + maiorElemento);
    }

    public static int encontrarMaiorElemento(int[] vetor) {
        int maiorElemento = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }
        return maiorElemento;
    }
}
