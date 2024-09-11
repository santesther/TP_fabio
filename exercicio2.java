
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/*
Fazer um programa para apresentar na tela a quantidade de nomes de jogos de videogame existente no
arquivo.
Utilizar o objeto System.in com o seu fluxo de entrada padr˜ao redirecionado. Fazer a leitura at´e que
chegue o final do arquivo, isto ´e, a vari´avel inteira que recebe o byte lido ganhe o valor -1. Lembrar que
cada jogo est´a contido em uma linha e que o caractere de fim de linha ´e o ’\n’.

*/

public class exercicio2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = null;
        int variavel, contador = 0;

        variavel = System.in.read();

		try {
			leitorNomes = new Scanner(file);
			while (variavel != -1) {
                String linha = leitorNomes.nextLine();
                contador++;
                String[] nomesJogos = linha.split(";");
                System.out.println("Número de jogos na lista: " + contador);
			}
            
		} 
		catch (IOException e) {
        }
    }
}
