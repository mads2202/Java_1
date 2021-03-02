package hw13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    CyclicBarrier cyclicBarrier;
    CountDownLatch countDownLatch;
    private static boolean winnerFound;
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cyclicBarrier,CountDownLatch countDownLatch) {
        this.cyclicBarrier = cyclicBarrier;
        this.countDownLatch=countDownLatch;
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            preparing();
            cyclicBarrier.await();


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        countDownLatch.countDown();
        checkWinner(this);
    }

    public void preparing() throws InterruptedException {
        System.out.println(this.name + " готовится");
        Thread.sleep(500 + (int) (Math.random() * 800));
        System.out.println(this.name + " готов");


    }
    private static synchronized void checkWinner(Car c) {
        if (!winnerFound) {
            System.out.println(c.name + " - WIN");
            winnerFound = true;
        }
    }
}
