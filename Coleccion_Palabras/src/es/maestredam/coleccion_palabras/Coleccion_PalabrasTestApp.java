package es.maestredam.coleccion_palabras;

public class Coleccion_PalabrasTestApp {

	public static void main(String[] args) {

		Coleccion_Palabras grupo1= new Coleccion_Palabras(4);
		Coleccion_Palabras DavidC= new Coleccion_Palabras(3);
		
		grupo1.mostrarPalabras();
		
		grupo1.a�adir("pera");
		grupo1.a�adir("pera");
		grupo1.a�adir("manzana"); // Esta esta repetida! No entra
		grupo1.a�adir("kiwi");
		grupo1.a�adir("tomate"); //Esta no cabe!
		
		
		System.out.println("--------------Grupo 1-------------");
		grupo1.mostrarPalabras();
	
		DavidC.a�adir("Hola");
		DavidC.a�adir("Mundo");
		DavidC.a�adir("Hola_Mundo");

		System.out.println("--------------DavidC -------------");
		DavidC.mostrarPalabras();
		

		
	}

}
