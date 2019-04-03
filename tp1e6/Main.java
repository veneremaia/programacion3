package tp1e6;

public class Main {

	public static void main(String[] args) {
	
		MiLista lista1 = new MiLista();
		lista1.addFront(5);
		lista1.addFront(4);
		lista1.addFront(8);
		lista1.addFront(1);
		lista1.addFront(13);
		
		MiIterador iterador = lista1.iterator();
		
		MiLista lista2 = new MiLista();
		lista2.addFront(8);
		lista2.addFront(2);
		lista2.addFront(0);
		lista2.addFront(5);

		MiLista resultante = new MiLista();
		
		while (iterador.hasNext()) {
			Object o = iterador.next();
			if(!lista2.contiene(o)) {
				resultante.addFront(o);
			}
		}
		
			
			MiIterador resul = resultante.iterator();
			
			while(resul.hasNext()) {
				System.out.println(resul.next());
		
			}
		
		
			
		
	}

}
