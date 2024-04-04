package com.example.trabvetor;

import java.util.ArrayList;
import java.util.Random;

public class Vetor05 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.add(random.nextInt());
        }

        System.out.println(vetor);
    }
}