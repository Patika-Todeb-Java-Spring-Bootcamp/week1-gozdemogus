package producerThreadPack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class producerThreadClass implements Runnable {

    protected BlockingQueue<String> blockingQueue = null;

    public producerThreadClass(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
        @Override
    public void run() {
            String writableInfo;

                Scanner s = new Scanner(System.in);

                System.out.println("\n Please type Team 1:");
                String team1 = s.nextLine();
                while (team1.isEmpty()) {
                    System.out.println("Team1 is empty! Retry.");
                    team1 = s.nextLine();
                }


                System.out.println("Please type Team 2:");
                String team2 = s.nextLine();
                while (team2.isEmpty()) {
                    System.out.println("Team2 is empty! Retry.");
                    team2 = s.nextLine();
                }

                System.out.println("Please type result of game. Example: 2-2");
                String score = s.nextLine();
                while (score.isEmpty()) {
                    System.out.println("Score is empty! Retry.");
                    score = s.nextLine();
                }


                if(team1.isEmpty() == false && team2.isEmpty() == false && score.isEmpty() == false) {

                    writableInfo = team1 + " " + score + " " +team2;

                    String desktopPath = System.getProperty("user.home") + "/" + "Desktop" + "/scores.txt";
                    FileWriter output = null;
                    try {
                        output = new FileWriter(desktopPath, true);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        output.write("\n" + writableInfo);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        output.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Score is saved: " + writableInfo);
                } else {
                    System.out.println("Fill the missing infos.");
                }
            }

}
