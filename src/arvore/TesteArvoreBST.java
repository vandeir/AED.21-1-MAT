package arvore;

public class TesteArvoreBST {

	public static void main(String[] args) {
		ArvoreBST<Integer> arvore = new ArvoreBST<>();
		
		arvore.inserir(63);
		arvore.inserir(27);
		arvore.inserir(80);
		arvore.inserir(13);
		arvore.inserir(51);
		arvore.inserir(70);
		arvore.inserir(92);
		arvore.inserir(26);
		arvore.inserir(33);
		arvore.inserir(58);
		arvore.inserir(82);
		arvore.inserir(57);
		arvore.inserir(60);
		System.out.println(arvore);
		
		System.out.println(arvore.buscar(80));
		System.out.println(arvore.buscar(57));
		System.out.println(arvore.buscar(100));
	}

}
