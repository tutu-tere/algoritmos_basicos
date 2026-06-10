import clases.Algoritmo;

public class Aplicacion {
  public static void main(String[] args) {
    // Prueba Metodo esPar
    System.out.println("\nPrueba metodo esPar");
    System.out.println(Algoritmo.esPar(45));
    System.out.println(Algoritmo.esPar(400));

    // Prueba esPrimo
    System.out.println("\nPrueba es Primo");
    System.out.println(Algoritmo.esPrimo(1));
    System.out.println(Algoritmo.esPrimo(2));
    System.out.println(Algoritmo.esPrimo(37));
  }
}
