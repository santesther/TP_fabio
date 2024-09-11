package ProgramaDisponibilizado2;

import java.util.Scanner;

public class buscaBinaria implements metodosDeBusca{

    @Override
    public Jogo buscarNome(ColecaoDeJogos listaDeJogos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int buscarNomeNoVetor(Jogo[] listaDeJogos, int totalDeJogos) 
    {
        MetodosOrdenacao tipOrdenacao = new ordenacaoBolha();
        listaDeJogos = tipOrdenacao.ordenarVetorPorOrdemAlfabetica(listaDeJogos, totalDeJogos, totalDeJogos);
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Digite o nome do jogo que você deseja encontrar");
        String nomeABuscar = entradaTeclado.nextLine();
        int inicio = 0, fim =totalDeJogos -1;
        int posicaoJogo = buscaBinariaRecursivaVetor(inicio, listaDeJogos, nomeABuscar, fim);
        if (posicaoJogo != -1)
        {
            return posicaoJogo;
        } else
        {
            return -1;
        }
    }

    private int buscaBinariaRecursivaVetor(int inicio, Jogo[] listaDeJogos, String nomeABuscar, int fim) {
        int meio, comparacao;
        while(inicio <= fim)
        {
            meio = (inicio + fim)/2;
            comparacao = nomeABuscar.compareTo(listaDeJogos[meio].obterNome());
            if(nomeABuscar.equals(listaDeJogos[meio].obterNome()))
            {
                return meio;
            }
        }
        return -1;
    }
    
}
