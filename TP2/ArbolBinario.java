import java.util.LinkedList;

public class ArbolBinario {
	private Nodo root;

	public ArbolBinario() {
		this.root = null;
	}

	public Integer getRoot() {
		return this.root.getInfo();
	}

	public LinkedList<Nodo> getFrontera() {
		return getFrontera(this.root);

	}

	private LinkedList<Nodo> getFrontera(Nodo r) {
		LinkedList<Nodo> resultado = new LinkedList<Nodo>();
		if ((!r.hasDer()) && (!r.hasIzq())) {
			resultado.add(r);
		}
		else {
			if (r.hasIzq()) {
				resultado.addAll(getFrontera(r.getIzq()));
			}
			if (r.hasDer()) {
				resultado.addAll(getFrontera(r.getDer()));
			}
		

		}
		return resultado;
	}
	
	public void insert(Integer i) {
		Nodo nuevo = new Nodo(i);
		if(this.root==null) 
			this.root = nuevo;
		else
		insert(this.root, nuevo);
	}
	
	private void insert(Nodo r, Nodo nuevo) {
		
		if(nuevo.getInfo() <r.getInfo()) {
			if(r.hasIzq())
				insert(r.getIzq(), nuevo);
			else
				r.setIzq(nuevo);
		}
		else if(nuevo.getInfo()>r.getInfo()) {
			if(r.hasDer()) 
				insert(r.getDer(), nuevo);
			else 
				r.setDer(nuevo);
		}
	}

}
