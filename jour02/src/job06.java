public class job06 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("La somme des nombres pairs entre 0 et 100 est égal a : " + total);
    }
}
