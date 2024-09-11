package lista7;

/*
 Crie um TAD pilha com aloca¸c˜ao encadeada. Implemente as seguintes funcionalidades:
(a) Adicionar elemento na Fila
(b) Excluir elemento da Fila
(c) Obter o primeiro elemento da Fila
(d) Verificar se a Fila est´a vazia
(e) Criar uma representa¸c˜ao para o objeto contendo todos os dados existentes
*/

public interface fila 
{
    listaEncadeada listaEncadeada = new listaEncadeada();

    public void adicionarElemento(int dado);

    public int excluirElemento();

    public int obterPrimeiroElemento();

    public boolean verificarSeEstaVazia();

    public String criarRepresentacao();
}
