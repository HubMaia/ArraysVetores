package com.mycompany.analisenumeros;
import java.util.Scanner;

    public class AnaliseNumeros {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //aqui nós vamos criar o vetor da coisa, esse vetor vai receber 10 valores. ele se chama numeros
        int [] numeros = new int[10];
        int soma = 0;
        int maior, menor;
        
        //pedindo pro usuario digitar as 10 variaveis
        System.out.println("Voce vai digitar 10 valores, ok?" );
        for (int i = 0; i<10; i++){            
            System.out.printf("Digita o " + (i+1) + " ");
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        
        maior =  numeros[0];
        menor = numeros[0];
        
        for (int i = 0; i<10; i++){            
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor  ) {
                menor = numeros[i];
            }
        }
        System.out.println("Esse foi seu menor valor " + menor + " , e esse foi o seu " + maior);
        System.out.println("\nA soma de todos os valores " + soma);
        
        // Fecha o scanner
        leitor.close();
    }
}
