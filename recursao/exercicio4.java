package recursao;

import java.util.Scanner;

/*
Fa¸ca um programa para encontrar o maior elemento de um vetor. Para tanto utilize uma fun¸c˜ao recursiva
que receba o vetor e a quantidade de elementos do mesmo, e retorne o maior valor encontrado 
*/

public class exercicio4 {
    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner(System.in);
        int tamanhoVetor, maior = 0;
        System.out.println("Insira um tamanho para o vetor");
        tamanhoVetor = entradaTeclado.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int contador = 0; contador < tamanhoVetor; contador++){
            System.out.println("Insira um número para o vetor na posição " + contador);
            vetor[contador] = entradaTeclado.nextInt();
        }
        maior = buscarMaior(vetor, tamanhoVetor, maior);
        System.out.println("O maior número é: " + maior);
        entradaTeclado.close();
    }

    static int buscarMaior(int[] vetor, int tamanhoVetor, int maior) {
        if (tamanhoVetor == 1){
            return vetor[0];
        } else{
            maior = buscarMaior(vetor, tamanhoVetor -1, maior);
            if (maior > vetor[tamanhoVetor - 1]){
                return maior;
            }
            return vetor[tamanhoVetor -1];
        }
    }
}
