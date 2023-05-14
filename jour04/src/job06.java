import java.util.Scanner;

public class job06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'éléments dans le tableau : ");
        int n = scanner.nextInt();

        int[] tableau = new int[n];
        System.out.println("Entrez les éléments du tableau : ");
        int valeur = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            tableau[i] = valeur;
        }

        long startTime = System.nanoTime();

        long somme = 0;
        for (int i = 0; i < n; i++) {
            somme += tableau[i];
        }
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        scanner.close();
        System.out.println("La somme de tous les éléments du tableau est : " + somme);
        System.out.println("Temps d'exécution : " + totalTime + " ms");
    }
}
