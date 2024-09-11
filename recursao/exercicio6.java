package recursao;

import java.util.Scanner;

/*
Melhore o programa anterior para converter tamb´em para a base hexadecimal. 
*/

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcaoOperacao = 0, numero;
        System.out.println("1 - passar para binário");
        System.out.println("2- passar para hexadecimal");
        System.out.println("3- sair do programa");
        System.out.println("Escolha uma operação ");
        opcaoOperacao = entradaTeclado.nextInt();
        System.out.println("Digite o número que deseja passar para binário ou hexadecimal");
        numero = entradaTeclado.nextInt();
        String qualquer = decimalParaHexadecimal(numero);
        //System.out.println("O número em hexadecimal é: " + qualquer);
        String qualquer2 = decimalParaBinario(numero);
        //System.out.println("O número em binário é: " + qualquer2);
        
        do {
        switch(opcaoOperacao){
            case 1:
            qualquer2 = decimalParaBinario(numero);
            System.out.println("O número em binário é: " + qualquer2);
            break;
            case 2:
            qualquer = decimalParaHexadecimal(numero);
            System.out.println("O número em hexadecimal é: " + qualquer);
        } 
    } while (opcaoOperacao != 3);
    }

    private static String decimalParaBinario(int n) {
        String numeroBinario = "";
        if (n > 0){
            int resto = (n%2);
            numeroBinario = decimalParaBinario(n/2) + resto;  
        } 
        return numeroBinario;
    }

    static String decimalParaHexadecimal(int n) {
        String numeroHexadecimal = "";
            int resto = (n % 16);
            if (n == 0){
                return "";
            } else{

            switch (resto) {
                case 10:
                    numeroHexadecimal = "A";
                    break;
                case 11:
                    numeroHexadecimal = "B";
                    break;
                case 12:
                    numeroHexadecimal = "C";
                    break;
                case 13:
                    numeroHexadecimal = "D";
                    break;
                case 14:
                    numeroHexadecimal = "E";
                    break;
                case 15:
                    numeroHexadecimal = "F";
                    break;

                default:
                    numeroHexadecimal = resto + numeroHexadecimal;
                    break;
            }
            
        }return decimalParaHexadecimal(n/16) + numeroHexadecimal;
    }       
}
