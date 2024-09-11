package ProgramaDisponibilizado2;

public class ordenacaoBolha implements MetodosOrdenacao{

    @Override
    public ColecaoDeJogos ordenarAno(ColecaoDeJogos listaDeJogos) 
    {
        boolean existiuTroca = true;
        int totalDeJogos = listaDeJogos.obterTotalDeJogos();
        if (totalDeJogos > 0)
        {
            do
            {
                existiuTroca = false;
                for(int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
                {
                    if (indiceDoJogo + 1 < totalDeJogos)
                    {
                        if(listaDeJogos.obterJogo(indiceDoJogo).obterAno() > listaDeJogos.obterJogo(indiceDoJogo + 1).obterAno())
                        {
                            Jogo auxiliarTrocaJogo = listaDeJogos.obterJogo(indiceDoJogo);
                            listaDeJogos.setJogo(indiceDoJogo, listaDeJogos.obterJogo(indiceDoJogo + 1));
                            listaDeJogos.setJogo(indiceDoJogo + 1, auxiliarTrocaJogo);
                            existiuTroca = true;
                        }
                    }
                }
            }while(existiuTroca);
        }
        System.out.println("Jogos ordenados por ano");
        return listaDeJogos;
    }

    @Override
    public ColecaoDeJogos ordenarPorVendas(Jogo[] listaDeJogos, int totalDeJogos, int tipo) 
    {
        boolean existiuTroca = true;
        if(totalDeJogos > 0)
        {
            do 
            {
                existiuTroca = false;
                for(int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
                {
                    if (indiceDoJogo + 1 < totalDeJogos)
                    {
                        if (listaDeJogos[indiceDoJogo].obterVendasGlobais() > listaDeJogos[indiceDoJogo + 1].obterVendasGlobais())
                        {
                            trocarPosicoes(listaDeJogos, indiceDoJogo, indiceDoJogo + 1);
							existiuTroca = true;
                        }
                    }
                }
            } while(existiuTroca);
        }
        return null;
    }

    private void trocarPosicoes(Jogo[] listaDeJogos, int indiceDoJogo, int i) 
    {
            Jogo auxiliarTrocaJogo;
			auxiliarTrocaJogo = listaDeJogos[indiceDoJogo];
			listaDeJogos[indiceDoJogo] = listaDeJogos[indiceDoJogo + 1];
			listaDeJogos[indiceDoJogo + 1] = auxiliarTrocaJogo;
    }

    @Override
    public Jogo[] ordenarVetor(Jogo[] listaDeJogos, int totalDeJogos, int tipo) 
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Jogo[] ordenarVetorPorOrdemAlfabetica(Jogo[] listaDeJogos, int totalDeJogos, int tipo) 
    {
        boolean existiuTroca;
        do 
        {
            existiuTroca = false;
            for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
            {
                if (indiceDoJogo + 1 < totalDeJogos)
                {
                    int comparacao = listaDeJogos[indiceDoJogo].obterNome().compareTo(listaDeJogos[indiceDoJogo + 1].obterNome());
                    if (comparacao > 0)
                    {
                        trocarPosicoes(listaDeJogos, indiceDoJogo, indiceDoJogo + 1);
                        existiuTroca = true;
                    }
                }
            }
        } while(existiuTroca);
        for( int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++)
        {
            Jogo jogo = listaDeJogos[indiceDoJogo];
            System.out.println("\n------------------------------------------");
			System.out.println("Nome do Jogo:" + jogo.obterNome());
			System.out.println("Plataforma:" + jogo.obterPlataforma());
			System.out.println("Ano de lançamento:" + jogo.obterAno());
			System.out.println("Total de vendas globais:" + jogo.obterVendasGlobais());
        }
        return listaDeJogos;
    }
    
}
