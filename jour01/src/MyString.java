public class MyString {
    public static void main(String[] args) {
        String s1 = "Bonjour";
        String s2 = new String("monde");
        char[] s3 = {'H', 'e', 'l', 'l', 'o'};
        String s4 = new String(s3);
        System.out.println(s1 + " " + s2);
        System.out.println(s4);
    }
}
