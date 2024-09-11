package lista1_correta;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/*
Fazer um programa para apresentar na tela a quantidade de nomes de jogos de videogame existente no
arquivo.
Utilizar o objeto System.in com o seu fluxo de entrada padr˜ao redirecionado. Fazer a leitura at´e que
chegue o final do arquivo, isto ´e, a vari´avel inteira que recebe o byte lido ganhe o valor -1. Lembrar que
cada jogo est´a contido em uma linha e que o caractere de fim de linha ´e o ’\n’
*/

public class exercicio2 {
    public static void main(String[] args) throws IOException {
        File listaJogos = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
            Scanner leitorLista = new Scanner(listaJogos);
            String nomeJogos[];
            int byteLidoDoArquivo, contador = 0;

            byteLidoDoArquivo = System.in.read();

            while (byteLidoDoArquivo != -1){
                nomeJogos = leitorLista.nextLine().split(";");
                contador++;
                System.out.println("Quantidade de jogos existentes no arquivo: " + contador);
            }
            
            leitorLista.close();
    }
}
