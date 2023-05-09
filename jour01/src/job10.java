import java.util.Scanner;
public class job10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre prenom :");
        String prenom = sc.nextLine();
        System.out.println("Entrez votre nom :");
        String nom = sc.nextLine();
        System.out.println("Vous vous appelez " + prenom + " " + nom + ".");
    }
}
