import java.util.Random;
public class job06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }
        for (int x : tab) {
            System.out.println(x);
        }
    }

}
