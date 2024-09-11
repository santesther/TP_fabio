package lista7;

public class filaVetor implements fila
{
    int[] vetor = new int[20];
    int totalDeDados = 0;

    @Override
    public void adicionarElemento(int dado) 
    {
        vetor[totalDeDados] = dado;
        totalDeDados++;
    }

    @Override
    public int excluirElemento() 
    {
        for (int indice = 0; indice < totalDeDados; indice++)
        {
            if (indice + 1 < totalDeDados)
            {
                vetor[indice] = vetor[indice + 1];
            } else
            {
                this.totalDeDados = totalDeDados - 1;
            }
        }
        return vetor[0];
    }

    @Override
    public int obterPrimeiroElemento() 
    {
        return vetor[0];
    }

    @Override
    public boolean verificarSeEstaVazia() 
    {
        return this.totalDeDados == 0;
    }

    @Override
    public String criarRepresentacao() 
    {
        String elementos = new String();
		for (int indice = 0; indice < totalDeDados; indice++) 
        {
			elementos = elementos + vetor[indice] + " "; 
		}
		return "ListaEncadeada [ "+ elementos + "]";
        
    }
}
    
