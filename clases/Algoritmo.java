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

  public static String stringEnReversa(String texto) {
    String textoReversa = "";
    for (int i = texto.length() - 1; i >= 0; i--) {
      textoReversa += texto.charAt(i);

    }
    return textoReversa;
  }

  public static boolean esPalindromo(String texto) {
    String textoEnReversa = stringEnReversa(texto);
    return texto.equalsIgnoreCase(textoEnReversa);
  }

  public static void secuenciaFizzBuzz(int numero) {
    for (int i = 1; i <= numero; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
