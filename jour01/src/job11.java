import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes :");
        int minutes = sc.nextInt();
        int heures = minutes / 60;
        int minutesRestantes = minutes % 60;
        System.out.println(minutes + " minutes correspondent à " + heures + " heures et " + minutesRestantes + " minutes.");

    }
}
