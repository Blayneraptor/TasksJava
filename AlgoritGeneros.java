import java.util.Scanner;

public class AlgoritGeneros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero, nombre;

        System.out.println("Escribe tu género:");
        genero = sc.next();
        System.out.println("Escribe tu nombre:");
        nombre = sc.next();

        if (genero.equals("masculino")) {
            System.out.println("Bienvenido " + nombre);
        } else if (genero.equals("femenino")) {
            System.out.println("Bienvenida " + nombre);
        } else {
            System.out.println("Hola Indeciso");
        }

        sc.close();
    }
}
