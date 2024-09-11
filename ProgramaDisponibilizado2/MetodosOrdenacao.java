package ProgramaDisponibilizado2;

public interface MetodosOrdenacao {
    public ColecaoDeJogos ordenarAno(ColecaoDeJogos listaDeJogos);

    public ColecaoDeJogos ordenarPorVendas(Jogo[] listaDeJogos, int totalDeJogos, int tipo);

    public Jogo[] ordenarVetor(Jogo[] listaDeJogos, int totalDeJogos, int tipo);

    public Jogo[] ordenarVetorPorOrdemAlfabetica(Jogo[] listaDeJogos, int totalDeJogos, int tipo);
}
