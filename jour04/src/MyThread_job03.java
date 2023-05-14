import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;

public class MyThread_job03 extends Thread{
    String alplhabet = "abcdefghijklmnopqrstuvwxyz";
    private int n;
    public MyThread_job03(int n2) {
        this.n = n2;
        for (int i = 0; i < n; i++) {
            try {
                FileWriter myWriter = new FileWriter("src\\output.txt", true);
                myWriter.write(alplhabet.charAt(new Random().nextInt(alplhabet.length())));
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
        }
    }
}
