package com.ua.sutty.prepare.produceCustomer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProduceCustomer {

    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                customer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

    private static void produce() throws InterruptedException {
        Random random = new Random(100);

        while(true){
            queue.put(random.nextInt());
        }
    }
    private static void customer() throws InterruptedException {

        while (true){
            Thread.sleep(100);

            System.out.println(queue.take() + "1");
            System.out.println("Queue size = " + queue.size());
        }
    }

}
