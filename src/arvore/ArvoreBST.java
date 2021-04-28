package arvore;

public class ArvoreBST<T extends Comparable> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<>(info));
		}
		else {
			this.getRaiz().inserir(info);
		}
	}
	
	public NoArvoreBST<T> buscar(T procurado) {
		return null;
	}
}
