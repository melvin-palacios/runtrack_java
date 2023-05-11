public class job02 {
    public static void main(String[] args) {
        int[] monTableau = {12,6,76,89};
        for (int x : monTableau) {
            System.out.println(x);
        }
        System.out.println("----");
        monTableau[0] = 10;
        monTableau[2] = 2;
        monTableau[3] = 64;
        for (int x : monTableau) {
            System.out.println(x);
        }
    }
}
