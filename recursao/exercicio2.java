package recursao;

/* 
Fazer uma fun¸c˜ao recursiva que receba um vetor de n´umeros inteiros e retorne a soma dos n´umeros de
forma recursiva. Fazer um programa principal para testar a fun¸c˜ao.
*/

public class exercicio2 {
    public static void main(String[] args) {
		System.out.println("Soma do intervalo de 0 a N:" + somarIntervalo(10));
	}

	static int somarIntervalo(int n) {
		if (n > 0) {
			return n + somarIntervalo(n - 1);
		}
		return 0;
	}
}

