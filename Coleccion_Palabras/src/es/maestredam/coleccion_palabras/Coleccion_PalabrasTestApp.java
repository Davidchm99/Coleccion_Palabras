package es.maestredam.coleccion_palabras;

public class Coleccion_PalabrasTestApp {

	public static void main(String[] args) {

		Coleccion_Palabras grupo1= new Coleccion_Palabras(4);
		Coleccion_Palabras DavidC= new Coleccion_Palabras(3);
		
		grupo1.mostrarPalabras();
		
		grupo1.añadir("pera");
		grupo1.añadir("pera");
		grupo1.añadir("manzana"); // Esta esta repetida! No entra
		grupo1.añadir("kiwi");
		grupo1.añadir("tomate"); //Esta no cabe!
		
		
		System.out.println("--------------Grupo 1-------------");
		grupo1.mostrarPalabras();
	
		DavidC.añadir("Hola");
		DavidC.añadir("Mundo");
		DavidC.añadir("Hola_Mundo");

		System.out.println("--------------DavidC -------------");
		DavidC.mostrarPalabras();
		

		
	}

}
