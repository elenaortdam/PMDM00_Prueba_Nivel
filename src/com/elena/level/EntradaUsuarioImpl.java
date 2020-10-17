package com.elena.level;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntradaUsuarioImpl implements EntradaUsuario {

	private final String ILLEGAL_ARGUMENT = "Argumento no permitido";

	private boolean isEmpty(String n) {
		if (n.isEmpty()) {
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT);
		}
		return true;
	}

	private boolean isNumber(String n) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(n.trim());
		if( !matcher.find()){
			throw new IllegalArgumentException(ILLEGAL_ARGUMENT);
		}
		return true;
	}

	@Override
	public boolean checkNumber(String n){
		isEmpty(n);
		return isNumber(n);
	}

}
