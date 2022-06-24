package consumerThreadPack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class consumerThreadClass implements Runnable {
    protected BlockingQueue<String> blockingQueue = null;

    public consumerThreadClass(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
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
