package ProgramaDisponibilizado2;

import java.util.Scanner;

public class buscaSequencial implements metodosDeBusca{
    
    @Override
    public Jogo buscarNome(ColecaoDeJogos listaDeJogos)
    {
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite o nome do jogo que você deseja encontrar");
        String jogoABuscar = entradaDados.nextLine();
        int totalDeJogos = listaDeJogos.obterTotalDeJogos();
        for(int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
        {
            if (jogoABuscar.equals(listaDeJogos.obterJogo(indiceDoJogo).obterNome()))
            {
                return listaDeJogos.obterJogo(indiceDoJogo);
            }
        }
        return null;
    }


    @Override
    public int buscarNomeNoVetor(Jogo[] listaDeJogos, int totalDeJogos)
    {
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite o nome do jogo que você deseja encontrar");
        String jogoABuscar = entradaDados.nextLine();
        
        for(int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
        {
            if (jogoABuscar.equals(listaDeJogos[indiceDoJogo].obterNome()))
            {
                return indiceDoJogo;
            }
        }
        return -1;
    }
}
    
