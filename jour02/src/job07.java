import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        int factorielle = 1;
        for (int i = 2; i <= nombre; i++) {
            factorielle *= i;
        }
        System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);

    }
}
