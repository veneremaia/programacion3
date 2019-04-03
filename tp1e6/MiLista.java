package tp1e6;

public class MiLista implements Iterable<Object> {

	private MiNodo first;
	private int size;

	public MiLista() {
		this.first = null;
		this.size = 0;
	}
	
	public void addFront(Object info) {
		MiNodo nuevoNodo = new MiNodo(info, this.first);
		this.first = nuevoNodo;
		this.size++;
	}


	public Object removeFront() {
		Object info = this.first.getInfo();
		this.first = this.first.getNext();
		this.size--;
		return info;
	}


	public Object get(int index) {
		int contador = 0; 

		MiNodo temporal = this.first;
		while (contador < index) {
			contador++;
			temporal = temporal.getNext();
		}

		return temporal.getInfo();
	}


	public int count() {
		int contador = 0;

		MiNodo temporal = this.first;
		while (temporal != null) {
			contador++;
			temporal = temporal.getNext();
		}

		return contador;
	}


	public int size() {
		return size;
	}


	public boolean isEmpty() {
		return this.first == null;

	}

	public boolean contiene(Object o) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) == o) {
				return true;

			}
		}
		return false;
	}
	
	public int contieneOrdenada(Object o, int busqueda) {
		for (int i = busqueda; i < this.size(); i++) {
			if (this.get(i) == o) {
				return i;

			}
		}
		return -1;
	}

	public MiIterador iterator() {

		return new MiIterador(this.first);
	}

}
