package MultiThreadConcurrency;

import java.nio.file.Files;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static final String INPUT_FILE ="resources/throughput/war_and_peace.txt";

    public static void main(String[] args) {
        /*String text=new String(Files.readAllBytes(new))*/

        int noOfThreads=4;
        Executor executor= Executors.newFixedThreadPool(noOfThreads);
    }
}
