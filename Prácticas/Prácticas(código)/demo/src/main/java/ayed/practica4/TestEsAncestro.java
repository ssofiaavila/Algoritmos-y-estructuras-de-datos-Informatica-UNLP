package ayed.practica4;

import ayed.tp02.ejercicio2.ListaEnlazadaGenerica;
import ayed.tp02.ejercicio2.ListaGenerica;
import ayed.tp04.ejercicio1.ArbolGeneral;

public class TestEsAncestro {

      /*
 ARBOL 
 				  11	
 		 /	   	   |        \
 		/          |         \
  	   13		   6		  7	
     / | \       /   \        |
    /  |  \     /     \       |
    3  4  5    8       9	  10
    						  |
    						  |
    						  24
    						  |
    						  |
    						  29
 */
    public static void main(String[] args){
        // SETUP PARA TEST
        ListaGenerica<ArbolGeneral<Integer>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();		
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> k = new ArbolGeneral<Integer>(24);
		ArbolGeneral<Integer> l = new ArbolGeneral<Integer>(29);		
		f.agregarHijo(h);
		f.agregarHijo(i);		
		g.agregarHijo(j);		
		j.agregarHijo(k);		
		k.agregarHijo(l);		
		lista.agregarFinal(c);
		lista.agregarFinal(d);
		lista.agregarFinal(e);		
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(13,lista);		
		lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();		
		lista.agregarFinal(b);
		lista.agregarFinal(f);
		lista.agregarFinal(g);		

		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(11,lista);

        //TEST
        if (a.esAncestro(10, 29)){
            System.out.println("10 es ancestro de 29");
        }
        else
            System.out.println("10 no es ansestro de 29");


    }
    
}
