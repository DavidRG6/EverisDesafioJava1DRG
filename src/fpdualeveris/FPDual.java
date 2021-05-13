package fpdualeveris;

import variables.Developer;

/**
 * EverisDesafioJava
 * 
 * @author driverog
 *
 */
public class FPDual {
	/**
	 * Metodo Principal de la clase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// llamada de la funcion

		VariablesChallenge();

	}

	/**
	 * Funcion privada del reto
	 */
	private static void VariablesChallenge() {

		// Generacion de objetos
		Developer d1 = new Developer("Pepe");
		Developer d2 = new Developer("Manue");
		Developer d3 = new Developer("Jose");
		Developer d4 = new Developer("Maria");

		// Nombre de la empresa
		System.out.println("Nombre de la empresa"+Developer.Empresa);

		// Numero de empleados totales
		System.out.println("Para el Desarrolador 1 hay un total de =" + d1.numTotal + " personas");
		System.out.println("Para el Desarrolador 4 hay un total de =" + d4.numTotal + " personas");
		
		// ID de los desarolladores
		System.out.println("La ID del Desarrollador 1 es:" + d1.ID);
		System.out.println("La ID del Desarrollador 1 es:" + d2.ID);
		System.out.println("La ID del Desarrollador 1 es:" + d3.ID);
		System.out.println("La ID del Desarrollador 1 es:" + d4.ID);

		// Reduccion de los dias de vacaciones del Desarrolador 2
		d2.setDiaVacaciones(d2.getDiaVacaciones() - 2);
		
		// Numero de dia de vacaciones totales de cada uno
		System.out.println("El desarrollador 1 posee un total de :" + d1.diaVacaciones+" dias de vacaciones");
		System.out.println("El desarrollador 2 posee un total de :" + d2.diaVacaciones+" dias de vacaciones");
		System.out.println("El desarrollador 3 posee un total de :" + d3.diaVacaciones+" dias de vacaciones");
		System.out.println("El desarrollador 4 posee un total de :" + d4.diaVacaciones+" dias de vacaciones");
	}
}
