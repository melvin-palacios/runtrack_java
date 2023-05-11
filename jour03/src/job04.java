public class job04 {
    public static void main(String[] args) {
        int[] tab = {3,7,3,9,8};
        int count = 0;
        for (int x : tab) {
            for (int y : tab) {
                if (x == y) {
                    count++;
                }
            }
            System.out.println("nombre d'occurence de " + x + " : " + count);
            count = 0;
        }
    }
}
