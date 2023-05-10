import java.util.Scanner;

public class job08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = sc.nextInt();
        int count = 0;
        while (nombre != 0) {
            nombre /= 10;
            count += 1;
        }
        System.out.println("le nombre de chiffre est : " + count);
    }
}
