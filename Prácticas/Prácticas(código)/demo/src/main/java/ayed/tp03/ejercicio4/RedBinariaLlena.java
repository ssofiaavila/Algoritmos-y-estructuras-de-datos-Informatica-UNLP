package ayed.tp03.ejercicio4;

import ayed.tp03.ejercicio1.ArbolBinario;

/*los nodos que conforman una red binaria llena tiene la 
 * particularidad de que todos ellos conocen
cuál es su retardo de reenvío. El retardo de reenvío
 se define como el período comprendido entre
que un nodo recibe un mensaje y lo reenvía a sus dos hijos.
Su tarea es calcular el mayor retardo posible, en el camino 
que realiza un mensaje desde la raíz
hasta llegar a las hojas en una red binaria llena.*/




public class RedBinariaLlena {
	private ArbolBinario<Integer> abb= new ArbolBinario<Integer>();
	
	public RedBinariaLlena(ArbolBinario<Integer> ab) {
		this.abb=ab;
	}
	
	public int retardoEnvio() {
		if (this.abb.esVacio())
			return 0;
		return this.retardoEnvio(this.abb);
	}

	private int retardoEnvio(ArbolBinario<Integer> ab) {
		if (ab.esHoja()) {
			return ab.getDato();
		}
		if (ab.esVacio())
			return 0;
		else {
			int cant=0;
			int izq=0;
			int dcho=0;
			if (ab.tieneHijoDerecho())
				dcho= this.retardoEnvio(ab.getHijoDerecho());
			if (ab.tieneHijoIzquierdo())
				izq=this.retardoEnvio(ab.getHijoIzquierdo());
			
			int max= Math.max(izq,dcho);
			return ab.getDato()+ max;	
		}
		
		
	}
	
}