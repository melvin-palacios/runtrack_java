import java.util.Scanner;

public class job03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaine de caractères :");
        int n = sc.nextInt();
        sc.close();
        int n2 = n/2;
        MyThread_job03 thread = new MyThread_job03(n2);
        MyThread_job03 thread2 = new MyThread_job03(n2);
        thread.start();
        thread2.start();
    }
}
 