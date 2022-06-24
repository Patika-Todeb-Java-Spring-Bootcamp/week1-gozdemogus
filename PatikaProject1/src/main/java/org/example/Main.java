package org.example;
import consumerPack.consumerClass;
import producerPack.producerClass;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        producerClass pw = new producerClass();
        consumerClass cr = new consumerClass();
        while(true) {

            try {
                pw.write();
                cr.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}