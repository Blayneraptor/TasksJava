import java.util.Scanner;

public class Calculos10num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumar = 0;
        int suma = 0;
        int csumpar = 0;
        int n;

        System.out.println("Escribe 10 números:");

        for (int s = 1; s <= 10; s++) {
            System.out.print("Ingrese un número " + s + ": ");
            n = sc.nextInt();

            if (n % 2 == 0) {
                csumpar++;
                sumar += n;
            } else {
                suma += n;
            }
        }

        System.out.println("Los números pares son: " + csumpar);
        System.out.println("La suma de los números pares es: " + sumar);
        System.out.println("El promedio de los números impares es: " + (double) suma / 10);

        sc.close();
    }
}
