import java.util.Scanner;

public class job12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = sc.nextLine();
        System.out.println("Entrez une autre phrase :");
        String phrase2 = sc.nextLine();
        System.out.println("Phrase 1 : " + phrase + "\nPhrase 2 : " + phrase2);
        phrase = phrase + phrase2;
        phrase2 = phrase.substring(0, phrase.length() - phrase2.length());
        phrase = phrase.substring(phrase2.length());
        System.out.println("`\nPhrase 1 : " + phrase + "\nPhrase 2 : " + phrase2);
    }
}
