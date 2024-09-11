package lista1_correta;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Fazer dois programas para apresentar os nomes de todos os jogos de videogame existentes no arquivo.
- O primeiro programa dever´a utilizar o objeto System.in com o seu fluxo de entrada padr˜ao redirecionado.
Fazer a leitura at´e que chegue o final do arquivo, isto ´e, a vari´avel inteira que recebe o byte lido ganhe o
valor -1.

*/
public class exercicio1 {
    public static void main(String[] args) throws IOException, InterruptedException{
            File listaJogos = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
            Scanner leitorLista = new Scanner(listaJogos);
            String nomeJogos[];
            int byteLidoDoArquivo;

            byteLidoDoArquivo = System.in.read();

            while (byteLidoDoArquivo != -1){
                nomeJogos = leitorLista.nextLine().split(";");
                System.out.println("Nome dos jogos: " + nomeJogos[0]);    
            }

            leitorLista.close();
    }
}
