package ec.edu.ups.pw.evaluacionwsChablaWilliam.utils;

import ec.edu.ups.pw.evaluacionwsChablaWilliam.modelo.Credito;
import ec.edu.ups.pw.evaluacionwsChablaWilliam.modelo.Persona;

public class Util {
	public static void main(String args[]){

		Persona persona  = new Persona();
		persona.setCedula("0302306915");
		persona.setApellido("William");
		persona.setNombre("Chabla");

		Credito credito = new Credito();
		credito.setCodigo(1);
		credito.setMonto(100.50);
		credito.setNumMeses(3);

		persona.setCredito(credito);

		System.out.println(persona.getCredito().getMonto());
		}
}
