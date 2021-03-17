package lista;

public class TesteListaEncadeada {
		public static void main(String[] args) {
			Lista lista = new ListaEncadeada();
			lista.inserir(50);
			lista.inserir(-15);
			lista.inserir(12);
			lista.inserir(28);
			lista.inserir(91);
			lista.inserir(50);
			System.out.println("Lista original = "+lista);
			System.out.println("50 = "+lista.buscar(50));
			System.out.println("91 = "+lista.buscar(91));
			System.out.println("0 = "+lista.buscar(0));
			
			Lista novaLista;
			novaLista = lista.dividir();
			System.out.println("Primeira lista (original pela metade) = "+lista);
			System.out.println("Lista criada pela divisão = "+novaLista);

			novaLista.inserir(100);
			System.out.println("Lista A = "+novaLista);
			lista.inserir(200);
			System.out.println("Lista B = "+lista);
			novaLista.concatenar(lista);
			System.out.println("Lista concatenada (A+B) = "+novaLista);
			
			Lista terceira = novaLista.copiar();
			System.out.println("Lista copiada = "+terceira);
			novaLista.retirar(100);
			terceira.retirar(200);
			System.out.println("Lista original (sem 100) = "+novaLista);
			System.out.println("Lista copiada (sem 200) = "+terceira);
			

	}

}
