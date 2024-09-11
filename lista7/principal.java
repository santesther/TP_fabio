package lista7;

public class principal {
    public static void main(String[] args)
    {
        fila fila = new filaVetor();
        System.out.println(fila.verificarSeEstaVazia());
        for (int indice = 0; indice < 10; indice++)
        {
            fila.adicionarElemento(indice);
        }

        System.out.println(fila.obterPrimeiroElemento());

        System.out.println(fila.verificarSeEstaVazia());
        System.out.println(fila.criarRepresentacao());
        System.out.println(fila.excluirElemento());
        System.out.println(fila.criarRepresentacao());
    }
    
}
