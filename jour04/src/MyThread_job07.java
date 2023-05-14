class MyThread_job07 extends Thread {
    private int[] tableau;
    private int debut;
    private int fin;
    private static int somme = 0;

    public MyThread_job07(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
    }

    public static int getSomme() {
        return somme;
    }

    public void run() {
        for (int i = debut; i < fin; i++) {
            somme += tableau[i];
        }
    }
}