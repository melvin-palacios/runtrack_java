public class job09 {
    public static void main(String[] args) {
        int nombre = 1234;
        int premierChiffre = 0;
        int dernierChiffre = nombre % 10;

        while (nombre != 0) {
            premierChiffre = nombre % 10;
            nombre = nombre / 10;
        }

        System.out.println("Le premier chiffre est : " + premierChiffre);
        System.out.println("Le dernier chiffre est : " + dernierChiffre);
    }
}
