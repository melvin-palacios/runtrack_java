import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class job02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Entrez la longueur de la chaine de caractères :");
        int n = sc.nextInt();
        sc.close();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(str.toString());
            writer.close();
            System.out.println("La chaîne de caractères aléatoire a été écrite dans le fichier output.txt.");
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de l'écriture dans le fichier.");
        }


    }
}
