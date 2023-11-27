import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        
        int[] num = new int[5];
        double suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 5 números:");
        
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            suma += num[i];
        }

        double media = suma / 5;

        System.out.println("La media aritmética es: " + media);

        sc.close();
    }
}
