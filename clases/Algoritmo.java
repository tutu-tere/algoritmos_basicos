package clases;

public class Algoritmo {

  public static boolean esPar(int numero) {
    // tambien pudo ir solo: return numero % 2 == 0;
    if (numero % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean esPrimo(int numero) {
    // numeros menores a 2
    if (numero < 2) {
      return false;
    }
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

}
