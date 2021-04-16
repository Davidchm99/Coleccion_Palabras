package es.maestredam.coleccion_palabras;

public class Coleccion_PalabrasTestApp {

	public static void main(String[] args) {

		Coleccion_Palabras grupo1= new Coleccion_Palabras(4);
		Coleccion_Palabras grupo2= new Coleccion_Palabras(3);
		
		grupo1.mostrarPalabras();
		
		grupo1.añadir("pera");
		grupo1.añadir("pera");
		grupo1.añadir("manzana"); // Esta esta repetida! No entra
		grupo1.añadir("kiwi");
		grupo1.añadir("tomate"); //Esta no cabe!
		
		
		
		grupo2.añadir("pera");
		grupo2.añadir("pera");
		grupo2.añadir("manzana"); // Esta esta repetida! No entra
		grupo2.añadir("kiwi");
		grupo2.añadir("tomate"); //Esta no cabe!

		
		System.out.println("--------------Grupo 1-------------");
		grupo1.mostrarPalabras();
		System.out.println("--------------Grupo 2-------------");
		grupo2.mostrarPalabras();
		
		grupo1.vaciar();
		
		System.out.println("--------------Grupo 1-------------");
		grupo1.mostrarPalabras();
		System.out.println("--------------Grupo 2-------------");
		grupo2.mostrarPalabras();
		
	}

}
