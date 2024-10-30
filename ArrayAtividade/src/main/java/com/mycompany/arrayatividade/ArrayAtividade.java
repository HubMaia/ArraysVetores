package com.mycompany.arrayatividade;

import java.util.ArrayList;

public class ArrayAtividade {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adiciona números à lista
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);

        // Contar e exibir o número de elementos pares
        int pares = contarPares(numeros);
        System.out.println("Quantidade de números pares: " + pares);
    }

    // Método para contar números pares
    public static int contarPares(ArrayList<Integer> numeros) {
        int count = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
