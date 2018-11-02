package com.ua.sutty.prepare;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++){
            executorService.submit(new Work());
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

    }

}

class Work implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("work finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
