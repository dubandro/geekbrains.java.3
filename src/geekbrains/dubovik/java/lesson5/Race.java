package geekbrains.dubovik.java.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Race {
    private CyclicBarrier start;
    private CountDownLatch finish;
    private ArrayList<Stage> stages;

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public CyclicBarrier getStart() {
        return start;
    }

    public CountDownLatch getFinish() {
        return finish;
    }

    public ArrayList<Stage> getStages() { return stages; }

    public void start() {
        start = new CyclicBarrier(GP.CARS_COUNT, () -> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));
    }

    public void finish() {
        finish = new CountDownLatch(GP.CARS_COUNT);
        try {
            finish.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}