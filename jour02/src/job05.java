import java.util.Scanner;
public class job05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre age: ");
        int age = sc.nextInt();
        if (age < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (age > 67) {
            System.out.println("Vous etes en age de prendre votre retraite.");
        } else if (age > 55) {
            System.out.println("Vous allez avoir du mal a trouver un travail.");
        } else {
            System.out.println("Vous pouvez travailler.");
        }
    }
}
