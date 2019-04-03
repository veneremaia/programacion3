package tp1e6;

import java.util.Iterator;



public class MiIterador implements Iterator<Object> {

	private MiNodo nodo;
	
	public MiIterador(MiNodo nodo) {
		this.nodo = nodo;
	}
	

	public boolean hasNext() {
		return this.nodo != null;
	}

	public Object next() {
		Object info = this.nodo.getInfo();
		this.nodo = this.nodo.getNext();
		return info;
	}
	public Object get() {
		Object info = this.nodo.getInfo();
	
		return info;
	}
}
