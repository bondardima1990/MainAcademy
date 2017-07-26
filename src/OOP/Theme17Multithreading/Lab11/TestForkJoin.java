package OOP.Theme17Multithreading.Lab11;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by DELL on 08.04.2017.
 */
public class TestForkJoin {

    static long numOfOperations = 10_000_000_000L;

    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(numOfThreads);
        System.out.println(new Date());
        System.out.println(forkJoinPool.invoke(new MyFork(0, numOfOperations)));
        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<Long>{
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= numOfOperations/numOfThreads){
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            }else {
                long middle = (from + to)/2;
                MyFork firstHaif = new MyFork(from, middle);
                firstHaif.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHaif.join()+ secondValue;
            }
        }
    }
}