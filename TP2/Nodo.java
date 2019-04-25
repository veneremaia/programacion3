
public class Nodo {

	private Integer info;
	private Nodo der;
	private Nodo izq;
	
	public Nodo(Integer info) {
		this.info = info;
		this.izq = null;
		this.der = null;
	}
	
	public Nodo getDer() {
		return this.der;
	}
	
	public Nodo getIzq() {
		return this.izq;
	}
	
	public boolean hasDer() {
		if(this.getDer()!=null) 
			return true;
		
		else
			return false;
	}
	
	public boolean hasIzq() {
		if(this.getIzq()!=null) 
			return true;
		
		else
			return false;
	}
	
	public void setDer(Nodo der) {
		this.der = der;
	}
	
	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}

}
