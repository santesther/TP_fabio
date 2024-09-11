package pilhas;

public class principal {
    public static void main(String[] args){
        PilhaEncadeada<Integer> p1 = new PilhaEncadeada<Integer>();
        PilhaEncadeada<Integer> p2 = new PilhaEncadeada<Integer>();
        PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();
        PilhaEncadeada<Character> pilha2 = new PilhaEncadeada<>();

        String novaPalavra = "arroz", operacao = "5+(2x2))";

        for (int indice = 0; indice < 10; indice++)
        {
            p1.adicionarElemento(indice);
        }
        for (int indice = 0; indice < 15; indice++)
        {
            p2.adicionarElemento(indice);
        }
        if (CompararPilhas(p1, p2) == 1)
        {
            System.out.println("Pilhas iguais");
        } else
        {
            System.out.println("Pilhas diferentes");
        }

        for (int indice=0; indice < novaPalavra.length(); indice++)
        {
            Character letra = novaPalavra.charAt(indice);
            pilha.push(letra);
        }
        System.out.println(InverterElementos(novaPalavra, pilha));

        for (int indice = 0; indice < operacao.length(); indice++)
        {
            Character letra = operacao.charAt(indice);
            pilha2.push(letra);
        }

		if (contarParenteses(operacao, pilha2) == 1){
			System.out.println("Tem o mesmo número de parenteses");
		} else{
			System.out.println("Não tem o mesmo número de parenteses");
		}
    }

    public static int CompararPilhas(PilhaEncadeada<Integer> p1, PilhaEncadeada<Integer> p2) 
	{
		int resposta = 0;
		while (p1.verificarSeEstaVazia() == false)
		{
			if(p1.excluirElemento().equals(p2.excluirElemento()))
			{
				resposta = 1;
			} else
			{
				resposta = 0;
				return resposta;
			}
			if(p1.verificarSeEstaVazia() == false && p2.verificarSeEstaVazia() != false)
			{
					return 0;
			} if(p2.verificarSeEstaVazia() == false && p1.verificarSeEstaVazia() != false)
			{
				return 0;
			}
		}
				return resposta;
	}

    public static String InverterElementos(String novaPalavra, PilhaEncadeada<Character> pilha) 
		{
			novaPalavra = "";
			while(pilha.verificarSeEstaVazia() == false)
			{
				novaPalavra += pilha.excluirElemento();
			}
			return novaPalavra;
			
		}

        public static int contarParenteses(String operacao,PilhaEncadeada<Character> pilha2) 
		{
			int abertura = 0, fechamento = 0;
			while (pilha2.verificarSeEstaVazia() == false)
			{
				Character letra = pilha2.excluirElemento();
				if (letra.equals('('))
				{
					abertura++;
				} if(letra.equals(')'))
				{
					fechamento++;
				}
			}
			if (abertura == fechamento)
			{
				return 1;
			} else
			{
				return 0;
			}
            
		}
    
}
