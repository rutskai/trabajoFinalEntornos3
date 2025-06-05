package conversion;

public class Conversor {

	// Para pasar de km a millas multiplicamos por la siguiente constante:
	private final static double KM_A_MILLAS = 0.62;

	// Para pasar de milibares a atmósferas multiplicamos por la siguiente
	// constante:
	private final static double MB_A_ATM = 0.00098;

	// Para pasar de calorías a julios multiplicamos por la siguiente constante:
	private final static double CAL_A_JULIOS = 4.184;

	// Recibe un número decimal y lo devuelve redondeado a dos decimales.
	public static double redondear(double num) {
		return Math.round(num * 100) / 100.0;
	}
  // Devuelve el número de millas equivalente a los quilómetros que recibe
	// como parámetro.
	public static double atmosferas(double mb) {
		return redondear(mb * MB_A_ATM);
	}

	// Devuelve el número de millas equivalente a los quilómetros que recibe
	// como parámetro.
	public static double milibares(double atmosferas) {
		return redondear(atmosferas / MB_A_ATM);
	}
}
