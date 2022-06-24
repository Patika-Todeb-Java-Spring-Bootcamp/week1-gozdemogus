package org.example;

import consumerThreadPack.consumerThreadClass;
import producerThreadPack.producerThreadClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

        consumerThreadClass reader = new consumerThreadClass(queue);
        producerThreadClass writer = new producerThreadClass(queue);

        String desktopPath =System.getProperty("user.home") + "/"+"Desktop" + "/scoresThread.txt";

        try {
            File myObj = new File(desktopPath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
               // System.out.println("Since file already exists, only append will happen");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
while (true) {
    new Thread(reader).start();


    new Thread(writer).start();
    try
    {
        Thread.sleep(5000);
    }
    catch(Exception re)
    {
    }
    new Thread(reader).join();
    new Thread(writer).join();
}
    }
}