import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
		ArbolBinario arbol = new ArbolBinario();
		arbol.insert(8);
		arbol.insert(6);
		arbol.insert(3);
		arbol.insert(9);
		arbol.insert(5);
		arbol.insert(7);
		arbol.insert(1);
		arbol.insert(21);
		arbol.insert(2);
		arbol.insert(11);
		
		Iterator<Nodo> resultado = arbol.getFrontera().iterator();
		
		while (resultado.hasNext()) {
			System.out.println(resultado.next().getInfo());

		}

	}

}
