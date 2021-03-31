package lista;

public class Teste1PilhaVetor {

	public static void main(String[] args) {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(50);
		pilha.push(40);
		pilha.push(30);
		pilha.push(20);
		pilha.push(10);
		try { 
			pilha.push(5);
			System.out.println("Não deveria ter chegado aqui!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(pilha);
		System.out.println("Consulta ao topo = 10 = "+pilha.peek());
		System.out.println("Retirada do topo = 10 = "+pilha.pop());
		System.out.println(pilha);
		System.out.println("Pilha vazia? "+pilha.estaVazia());
		pilha.liberar();
		System.out.println(pilha);
		System.out.println("Pilha vazia? "+pilha.estaVazia());
		try { 
			pilha.pop();
			System.out.println("Não deveria ter chegado aqui!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
