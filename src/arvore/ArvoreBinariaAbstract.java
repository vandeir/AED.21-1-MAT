package arvore;

public abstract class ArvoreBinariaAbstract<T> {
	private NoArvoreBinaria<T> raiz;

	public ArvoreBinariaAbstract() {
		super();
	}
	
	protected void setRaiz(NoArvoreBinaria<T> r) {
		this.raiz = r;
	}
	
	protected NoArvoreBinaria<T> getRaiz() {
		return this.raiz;
	}
	
	public boolean vazia() {
		return (raiz == null);
	}
	
	public NoArvoreBinaria<T> pertence(T procurado){
		if (this.vazia()) {
			return null;
		}
		return raiz.pertence(procurado);
	}
	
	@Override
	public String toString() {
		if (this.vazia()) {
			return "<>";
		}
		return raiz.imprimePre();
	}
}
