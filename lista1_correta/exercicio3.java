package lista1_correta;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Fazer um programa para apresentar quantas unidades foram vendidas de um determinado jogo (Em
milh˜oes de unidades). O programa dever´a perguntar o nome do jogo e apresentar a quantidade de unidades
vendidas.
O programa dever´a instanciar a classe Scanner com o construtor recebendo um objeto do tipo File.
Buscar os m´etodos para facilitar a leitura dos tokens separados por ”,” (v´ırgula).
Fazer a leitura enquanto o m´etodo hasNext() do objeto Scanner retornar True.

*/

public class exercicio3 {
    public static void main(String[] args) throws IOException {
        File arquivoJogos = new File ("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
        Scanner leitorDoArquivo = new Scanner(arquivoJogos);
        Scanner leitorDadosTeclado = new Scanner(System.in);
        String vetorJogos[]; 
        String nomeDoJogoParaBuscar;
        
        System.out.println("Informe o nome do jogo que você deseja encontrar ");
        nomeDoJogoParaBuscar = leitorDadosTeclado.nextLine();

        do {
            vetorJogos = leitorDoArquivo.nextLine().split(";");
        }
        while ((leitorDoArquivo.hasNext()) && (!vetorJogos[0].equals(nomeDoJogoParaBuscar)));
        if (vetorJogos[0].equals(nomeDoJogoParaBuscar)){
        	System.out.println("O jogo teve " + vetorJogos[2] + " milhões de unidades vendidas.");
        }
        else {
        	System.out.println("Jogo não encontrado!");
        }
        leitorDadosTeclado.close();
        leitorDoArquivo.close();
    }
}
