package es.maestredam.coleccion_palabras;

import java.util.Arrays;
/**
 * Clase para crear objetos ColeccionPalabras, que contengan un
 * conjunto de cadenas, con un máximo.
 * @author David Chico Molina
 *
 */

public class Coleccion_Palabras {
	
	private final static int NUM_ELEMS_DEF=5;
	
	private final static int ERR_OK = 0;
	private final static int ERR_REPETIDO = -1;
	private final static int ERR_LLENO = -2;
	
	private String lista[];
	private boolean ocupada[];
	
	private int maxElementos;
	private int numElementos;
	
	
	
	//CONSTRUCTORES 
	public Coleccion_Palabras() {
		this(NUM_ELEMS_DEF);
		
	}
	/**
	 * Constructor con nï¿½ de palabras max 
	 * @param maxElementos num maximo
	 * @throws IllegalArgumentException cuando el numero max indicado es <=0
	 */
	public Coleccion_Palabras(int maxElementos) throws IllegalArgumentException {
		if (maxElementos<=0) {
			//lanzar una excepcion
			IllegalArgumentException exc = new IllegalArgumentException("maxElements<=0");
			throw exc;
			// throw new IllegalArgumentException("maxElements<=0");
		}
		
		this.lista = new String[maxElementos];
		this.ocupada = new boolean[maxElementos];
		this.setMaxElementos(maxElementos); 
		this.setNumElementos(0);
	// Otras tareas iniciales: poner todas las posiciones libres.
	Arrays.fill(ocupada,false);
	
	//Pensamos que sera mejor rellenar los elementos con "" inicialmente
	Arrays.fill(lista,"");
		
	}
	
	public int añadir(String palabra) {
		
		int ret = ERR_OK;
		
		//1. Comprobar si estï¿½ llena
		if (estaLlena()) {
			ret = ERR_LLENO;
		}
		//2. Verificar que no está ya en la lista
		else if (contienePalabra(palabra)) {
				ret = ERR_REPETIDO;
		}
		
		if (ret != ERR_OK) {
				return ret;
		}
			
		
		//3.Encontrar hueco y añadirla
		boolean añadida = false;
		for (int i=0; i<ocupada.length && !añadida; i++) {
			if (!ocupada[i]) {
				lista[i]   = palabra;
				ocupada[i] = true;
				añadida = true;
			}	
		}
		this.setNumElementos(this.getNumElementos() + 1);
			
		return ret;
			
		}
	
	/**
	 --------
	 manzana false -> al aï¿½adir la manzana deberï¿½a devolver false (no la contiene)
	 pera true
	 * 
	 */
	private boolean contienePalabra(String palabra) {
		for (int i=0; i<lista.length; i++) {
			if(ocupada[i] && lista[i].equalsIgnoreCase(palabra)) {
				return true;
			}
		}	
	 	return false;
	}
	
	
	
	public boolean estaLlena() {
		
/*	for (boolean posicion :ocupada) {
		if (posicion == false) {
			return false;
		}
	}
		return true;
	}*/
	boolean ret = true;
	boolean encontrado = false;
	int pos = 0;
	while (pos<ocupada.length && !encontrado) {
		if (ocupada[pos] == false){
			encontrado = true;
			ret = false; // no esta llena porque he encontrado un hueco
		}
		else {
			pos++;
		}
	}
	
	return ret;
	
	}
	
	public void mostrarPalabras() {
		for(int i=0;i<ocupada.length;i++) {
			if (ocupada[i]) {
				System.out.printf("%s%n",lista[i]);
			}
		}
	}
	
	public void vaciar() {
		Arrays.fill(ocupada,false);
		
	}
	
	/*public int extraer(int num) {
		if (num > numElementos) {
			;
		}
	}*/
		
	
	//GETTERS AND SETTERS
	public int getMaxElementos() {
		return maxElementos;
	}
	public void setMaxElementos(int maxElementos) {
		this.maxElementos = maxElementos;
	}
	public int getNumElementos() {
		return numElementos;
	}
	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}
	
}
