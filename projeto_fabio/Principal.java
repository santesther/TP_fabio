package projeto_fabio;

import java.io.FileNotFoundException;
import java.util.Scanner;




public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner entradaDoTeclado = new Scanner(System.in);	
		int opcaoArmazenamentoEmMemoria, opcaoMenuPrincipal;
		ColecaoDeJogos listaDeJogos;
		System.out.println("1 - Vetor");
		System.out.println("2 - ArrayList");
		System.out.println("Qual a estrutura de armazenamento em memória você deseja utilizar?");
		opcaoArmazenamentoEmMemoria = entradaDoTeclado.nextInt();
		if (opcaoArmazenamentoEmMemoria == 1) {
			listaDeJogos = new VetorDeJogos();
		}
		else {
			listaDeJogos = new ArrayListDeJogos();
        }
		do 
		{
			System.out.println("\n\n*************** Menu de Opções ****************");
			System.out.println("1 - Adicionar jogo");
			System.out.println("2 - Excluir jogo");
			System.out.println("3 - Listar jogos");
            System.out.println("4 - Ordenar lista pelo ano");
            System.out.println("5- Ordenar lista pelas vendas");
			System.out.println("0 - Sair do programa");
			opcaoMenuPrincipal = entradaDoTeclado.nextInt();			
			switch (opcaoMenuPrincipal) {
			case 1: adicionarJogo(listaDeJogos);
					break;
			case 2: excluirJogo(listaDeJogos);
					break;
			case 3: listarJogos(listaDeJogos);
					break;   
            case 4: ordenarAno(listaDeJogos);
                    break;
            case 5: ordenarVendas(listaDeJogos);
                    break;   
			}
		}
		while (opcaoMenuPrincipal != 0);
	}

	private static void adicionarJogo(ColecaoDeJogos listaDeJogos) {
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

	private static void excluirJogo(ColecaoDeJogos listaDeJogos) {
		boolean excluiu;
		
		excluiu = listaDeJogos.excluirJogo();
		if (excluiu == true) {
			System.out.println("Jogo excluído com sucesso.");
		}
		else {
			System.out.println("Jogo não encontrado.");
		}
	}
	
	private static void listarJogos(ColecaoDeJogos listaDeJogos) {
		int totalDeJogos = listaDeJogos.obterTotalDeJogos();
		
		if (totalDeJogos > 0) {
			Jogo jogo;
			for (int indiceDoJogo = 0; indiceDoJogo < totalDeJogos; indiceDoJogo++) {
				jogo = listaDeJogos.obterJogo(indiceDoJogo);
				System.out.println("\n------------------------------------------");
				System.out.println("Nome do Jogo:" + jogo.obterNome());
				System.out.println("Plataforma:" + jogo.obterPlataforma());
				System.out.println("Ano de lançamento:" + jogo.obterAno());
				System.out.println("Total de vendas globais:" + jogo.obterVendasGlobais());
			}
		}
		else {
			System.out.println("Não existem jogos cadastrados na lista.");
		}
	}

    private static void ordenarAno(ColecaoDeJogos listaDeJogos){
       System.out.println("Jogos foram ordenados por ano");

           listaDeJogos.ordenarAno(listaDeJogos.retornarVetor());
       
       
	} 


    private static void ordenarVendas(ColecaoDeJogos listaDeJogos) {
        System.out.println("Jogos foram ordenados por número de vendas");
        listaDeJogos.ordenarVendas(listaDeJogos.retornarVetor());
    }
}
