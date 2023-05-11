public class job05 {
    public static void main(String[] args) {
        int[] tab = {3,7,3,9,8};
        int count = 0;
        for (int x : tab) {
            for (int y : tab) {
                if (x == y) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("valeur unique du tableau : " + x);
            }
            count = 0;
        }
    }
}
