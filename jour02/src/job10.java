public class job10 {
    public static void main(String[] args) {
        int nombre = 1234;
        int total = 0;

        while (nombre != 0) {
            total += nombre % 10;
            nombre /= 10;
        }
        System.out.println("La somme des chiffres est : "  + total);
    }
}
