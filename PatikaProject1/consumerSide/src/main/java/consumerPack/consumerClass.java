package consumerPack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class consumerClass {
    public void read() {
        // Passing the path to the file as a parameter
        FileReader input;
        try {
            String desktopPath =System.getProperty("user.home") + "/"+"Desktop" + "/scores.txt";
            input = new FileReader(desktopPath);
//      input = new FileReader("/Users/gozdemogus/eclipse-workspace/scores/score.txt");
            try {
                int data = input.read();
                System.out.print("Results:\n");
                while (data != -1) {
                    System.out.print((char) data);

                    data = input.read();
                }
                input.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
