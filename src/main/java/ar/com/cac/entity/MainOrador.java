package ar.com.cac.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		
		Orador nuevoOrador = new Orador("Cristian", "Miranda", "correo@correo.com", "JAVA", LocalDate.now());

		System.out.println(nuevoOrador);
	}

}
