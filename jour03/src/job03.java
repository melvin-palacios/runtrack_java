public class job03 {
    public static void main(String[] args) {
        String[] tableau = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(tableau[1]);
        System.out.println("----");
        tableau[2] = "Mireille";
        for (String x : tableau) {
            System.out.println(x);
        }
    }
}
