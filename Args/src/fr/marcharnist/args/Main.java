package fr.marcharnist.args;

/**
 * @version 1.0
 * @author GCKEVL - Marc Harnist
 *
 * Exercices de veille en Java
 * 
 * Héritages
 * Instanciation d'une classe
 * 
 */

public class Main {

	public static void main(String[] argumentsPersonnalises) {
		
		if(argumentsPersonnalises.length == 0) {
			System.out.println("Vous pouvez renseigner un argument!");
		}
		
		//Petit test d'affichage des arguments
		for(String arg : argumentsPersonnalises) {
			System.out.print(arg + " ");
		}
		System.out.println();

	}
}
