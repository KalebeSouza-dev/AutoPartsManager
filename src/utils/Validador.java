package utils;

public class Validador {
	public static boolean validador(String str, String campo) {
		if (str == null || str.trim().isEmpty()) return false;
		return true;
	}
}
