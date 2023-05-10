import java.util.Scanner;
public class job03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.print("\n" + i + " X " + num + " = "+ num * i);
        }
    }
}
