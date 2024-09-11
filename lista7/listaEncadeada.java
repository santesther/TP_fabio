package lista7;



public class listaEncadeada implements fila{
    No inicio = null;

    @Override
    public void adicionarElemento(int dado) {
        No novo = new No(dado);
        novo.proximo = this.inicio;
        this.inicio = novo;
    }

    @Override
    public int excluirElemento() {
        if (this.inicio != null) {
			this.inicio = this.inicio.proximo;
			return 1;
		}
		return -1;
    }

    @Override
    public int obterPrimeiroElemento() {
        No novo = this.inicio;
		No noAnterior = null;
	
		if (this.inicio != null) {
			while (novo.proximo != null) {
				noAnterior = novo;
				novo = novo.proximo;
                if (novo.proximo == null){
                    return novo.dado;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean verificarSeEstaVazia() {
        return this.inicio == null;
    }

    @Override
    public String criarRepresentacao() {
        String elementos = new String();
        No novo = this.inicio;
        while (novo != null) {
            elementos = elementos + novo.dado + " "; 
            novo = novo.proximo;
        }
        return "ListaEncadeada [ "+ elementos + "]";
    }
    
}
