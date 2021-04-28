package arvore;

public class ArvoreBST<T extends Comparable> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<>(info));
		} else {
			((NoArvoreBST<T>)this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T procurado) {
		if (this.vazia()) {
			return null;
		} else {
			return ((NoArvoreBST<T>)this.getRaiz()).buscar(procurado);
		}
	}


}
