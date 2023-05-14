import java.util.Scanner;

public class job07 {
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
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new MyThread_job07(tableau, 0, n/2));
        Thread thread2 = new Thread(new MyThread_job07(tableau, n/2, n));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(MyThread_job07.getSomme());
        System.out.println("Temps d'exécution : " + (end - start) + "ms");
    }
}