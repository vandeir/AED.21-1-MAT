package lista;

public interface Lista {

	void inserir(int valor);

	int buscar(int valor);

	void retirar(int valor);

	String toString();

	boolean estaVazia();

	Lista copiar();

	void concatenar(Lista outra);

	Lista dividir();

	int getTamanho();

	int pegar(int posicao);

}