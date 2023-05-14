import java.util.Scanner;

public class job05 {
    public static void main(String[] args) throws InterruptedException {
        long start, end, total;
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number :");
        num = scanner.nextInt();
        scanner.close();
        System.out.println();
        start = System.nanoTime();

        Thread thread1 = new Thread(() -> {
            int i = 0;

            while (i < (num/2)) {
                i++;
            }
        });

        Thread thread2 = new Thread(() -> {
            int i = (num/2);

            while (i < num) {
                i++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        end = System.nanoTime();
        total = end - start;

        System.out.println("Total count : " + num);
        System.out.println("Time " + total/1000000 + " ms.");
    }
}