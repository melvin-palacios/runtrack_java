public class Facture {
    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float tva = 1.20f;
        float tarifHF = prix * quantite;
        float taxe = tarifHF * tva - tarifHF;
        System.out.println("Le montant hors frais est : " + tarifHF);
        System.out.println("Le montant de la taxe est : " + taxe);
        float tarifTTC = tarifHF + taxe;
        System.out.println("Le montant total est : " + tarifTTC);


    }
}
