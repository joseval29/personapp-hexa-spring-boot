package co.edu.javeriana.as.personapp.terminal.util;

import java.util.Scanner;

public final class Consola {

	private Consola() {
	}

	public static int leerEntero(Scanner keyboard, String mensaje) {
		while (true) {
			String linea = leerTexto(keyboard, mensaje);
			try {
				return Integer.parseInt(linea);
			} catch (NumberFormatException e) {
				System.out.println("Ingrese un número válido.");
			}
		}
	}

	public static int leerEnteroPositivo(Scanner keyboard, String mensaje) {
		while (true) {
			int numero = leerEntero(keyboard, mensaje);
			if (numero > 0)
				return numero;
			System.out.println("El número debe ser mayor a 0.");
		}
	}

	public static String leerTexto(Scanner keyboard, String mensaje) {
		System.out.print(mensaje);
		return keyboard.nextLine().trim();
	}

	public static String leerOpcional(Scanner keyboard, String mensaje) {
		String texto = leerTexto(keyboard, mensaje);
		return texto.isEmpty() ? null : texto;
	}
}
