import java.util.Scanner;

public class job04 {
    public static void main(String[] args) {
        long start, end, total;
        int num, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number :");
        num = scanner.nextInt();
        scanner.close();
        start = System.nanoTime();
        System.out.println();

        while (i < num) {
            i++;
        }

        end = System.nanoTime();
        total = end - start;

        System.out.println("Total count : " + i);
        System.out.println("Time : " + total/1000000 + " ms.");
    }
}