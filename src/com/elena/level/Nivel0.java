package com.elena.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Nivel 0: Programa que calcule el número de número de kilómetros correspondientes a un número
 * N de millas marinas introducidas por teclado. (El número de metros de una milla marina es de 1852).
 */
public class Nivel0 {

	private final float KILOMETRE = 1.852f;

	public float calculateMile() throws IOException {

		System.out.println("Conversor millas a kilómetros");
		BufferedReader entradaDatos = new BufferedReader(new InputStreamReader(System.in));
		EntradaUsuarioImpl entradaUsuario = new EntradaUsuarioImpl();
		String datos = entradaDatos.readLine().trim();
		entradaUsuario.checkNumber(datos);

		return Integer.parseInt(datos) / KILOMETRE;
	}

}
