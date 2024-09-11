package ProgramaDisponibilizado2;

import java.util.Scanner;

public class VideogameMemoriaInterface 
{

	public static void main(String[] args) 
	{
		Scanner entradaDoTeclado = new Scanner(System.in);
		int opcaoArmazenamentoEmMemoria, opcaoMenuPrincipal, opcaoArmazenamentoEmArquivo;
		ColecaoDeJogos listaDeJogos = null;
		ArquivoDeJogos arquivoDeJogos;
		metodosDeBusca metodosDeBusca;
		System.out.println("1 - Vetor");
		System.out.println("2 - ArrayList");
		System.out.println("3 - Lista encadeada");
		System.out.println("Qual a estrutura de armazenamento em memória você deseja utilizar?"); 
		opcaoArmazenamentoEmMemoria = entradaDoTeclado.nextInt();
		switch(opcaoArmazenamentoEmMemoria){
			case 1:
			listaDeJogos = new VetorDeJogos();
			break;
			case 2:
			listaDeJogos = new ArrayListDeJogos();
			break;
			case 3: 
			listaDeJogos = new listaEncadeada();
			break;
		}
		System.out.println("1 - Arquivo texto");
		System.out.println("2 - Arquivo serializado");
		System.out.println("Qual a estrutura de armazenamento em arquivo você deseja utilizar?"); 
		opcaoArmazenamentoEmArquivo = entradaDoTeclado.nextInt();
		if(opcaoArmazenamentoEmArquivo == 1)
		{
			arquivoDeJogos = new arquivoTextoDeJogos();
			lerDoArquivoParaMemoria(arquivoDeJogos, listaDeJogos);
		} else
		{
			arquivoDeJogos = new tratamentoDeDados();
			lerDoArquivoParaMemoria(arquivoDeJogos, listaDeJogos);
		}
		do 
		{
			System.out.println("\n\n*************** Menu de Opções ****************");
			System.out.println("1 - Adicionar jogo");
			System.out.println("2 - Excluir jogo");
			System.out.println("3 - Listar jogos");
			System.out.println("4 - Ordenar jogos por ano");
			System.out.println("5 - Ordenar jogos por vendas globais");
			System.out.println("6 - Buscar jogo por nome");
			System.out.println("0 - Sair do programa");
			opcaoMenuPrincipal = entradaDoTeclado.nextInt();
			switch (opcaoMenuPrincipal) 
			{
				case 1:
					adicionarJogo(listaDeJogos);
					escreverDaMemoriaNoArquivo(arquivoDeJogos, listaDeJogos, opcaoArmazenamentoEmMemoria);
					break;
				case 2:
					excluirJogo(listaDeJogos);
					escreverDaMemoriaNoArquivo(arquivoDeJogos, listaDeJogos, opcaoArmazenamentoEmMemoria);
					break;
				case 3: 
					if (opcaoArmazenamentoEmMemoria != 3){
						listarJogos(listaDeJogos);
					} else{
						listarIterador(listaDeJogos);
					}
					break;
				case 4:
					ordenarJogosPorAno(listaDeJogos);
					escreverDaMemoriaNoArquivo(arquivoDeJogos, listaDeJogos, opcaoArmazenamentoEmMemoria);
					break;
				case 5:
					ordenarJogosPorVendasGlobais(listaDeJogos);
					escreverDaMemoriaNoArquivo(arquivoDeJogos, listaDeJogos, opcaoArmazenamentoEmMemoria);
					break;
				case 6:
					buscarJogoPorNome(listaDeJogos);
					break;
			}
		} while (opcaoMenuPrincipal != 0);
		
	}

	private static void adicionarJogo(ColecaoDeJogos listaDeJogos)
	 { 
		Scanner entradaDoTeclado = new Scanner(System.in);
		String nome, plataforma;
		int ano;
		double vendasGlobais;

		System.out.println("Entre com o nome do jogo:");
		nome = entradaDoTeclado.nextLine();
		System.out.println("Entre com a plataforma:");
		plataforma = entradaDoTeclado.nextLine();
		System.out.println("Entre com o ano de lançamento:");
		ano = entradaDoTeclado.nextInt();
		System.out.println("Entre com o total de vendas globais:");
		vendasGlobais = entradaDoTeclado.nextDouble();
		Jogo jogo1 = new Jogo(nome, plataforma, ano, vendasGlobais); 
		listaDeJogos.adicionarJogo(jogo1); 
	}

	private static void excluirJogo(ColecaoDeJogos listaDeJogos) 
	{
		boolean excluiu;

		excluiu = listaDeJogos.excluirJogo();
		if (excluiu == true) 
		{
			System.out.println("Jogo excluído com sucesso.");
		} else 
		{
			System.out.println("não há jogos suficientes para exclusão");
		}
	}

	private static void listarJogos(ColecaoDeJogos listaDeJogos) 
	{
        int totalDeJogos = listaDeJogos.obterTotalDeJogos();
        if (totalDeJogos > 0) 
		{
            Jogo jogo;
            for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) 
			{
                jogo = listaDeJogos.obterJogo(indiceDoJogo);
                System.out.println("\n------------------------------------------");
                System.out.println("Nome do Jogo:" + jogo.obterNome());
                System.out.println("Plataforma:" + jogo.obterPlataforma());
                System.out.println("Ano de lançamento:" + jogo.obterAno());
                System.out.println("Total de vendas globais:" + jogo.obterVendasGlobais());
            }
        } else 
		{
            System.out.println("Não existem jogos cadastrados na lista.");
        }
    }

	private static void ordenarJogosPorAno(ColecaoDeJogos listaDeJogos) 
	{
		listaDeJogos.ordenarJogosPorAno();
	}

	private static void ordenarJogosPorVendasGlobais(ColecaoDeJogos listaDeJogos) 
	{
		listaDeJogos.ordenarJogosPorVendasGlobais();
	}

	private static void buscarJogoPorNome(ColecaoDeJogos listaDeJogos) 
	{
		Jogo jogoBuscado = listaDeJogos.buscarJogoPorNome(new buscaBinaria());

		if (jogoBuscado != null) 
		{
			
			System.out.println("\n------------------------------------------");
			System.out.println("Nome do Jogo:" + jogoBuscado.obterNome());
			System.out.println("Plataforma:" + jogoBuscado.obterPlataforma());
			System.out.println("Ano de lançamento:" + jogoBuscado.obterAno());
			System.out.println("Total de vendas globais:" + jogoBuscado.obterVendasGlobais());
		} else 
		{
			System.out.println("O jogo não foi encontrado");
		}
	}

	private static void lerDoArquivoParaMemoria(ArquivoDeJogos arquivoDeJogos, ColecaoDeJogos listaDeJogos) 
	{
		arquivoDeJogos.lerDoArquivoParaMemoria(listaDeJogos);
	}

	public static void listarIterador(ColecaoDeJogos listaDeJogos)
	{
		Iterador iterador = listaDeJogos.obterIterador();
		Jogo jogo;
		while(iterador.temProximo())
		{
            jogo = iterador.obterElemento();
                System.out.println("\n------------------------------------------");
                System.out.println("Nome do Jogo:" + jogo.obterNome());
                System.out.println("Plataforma:" + jogo.obterPlataforma());
                System.out.println("Ano de lançamento:" + jogo.obterAno());
                System.out.println("Total de vendas globais:" + jogo.obterVendasGlobais());
        }

	}

	private static void escreverDaMemoriaNoArquivo(ArquivoDeJogos arquivoDeJogos, ColecaoDeJogos listaDeJogos, int tipo)
	{
		arquivoDeJogos.escreverDaMemoriaNoArquivo(listaDeJogos, tipo);
	}
}