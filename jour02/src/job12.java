public class job12 {
    public static void main(String[] args) {
    int[] des = {1, 2, 3, 4, 5, 6};
    int count = 0;

        for (int i : des) {
            for (int j : des) {
                for (int k : des) {
                    System.out.println(i + " " + j + " " + k);
                    count++;
                }
            }
        }

    System.out.println("Le nombre total de combinaisons possibles est : " + count);
}
}
