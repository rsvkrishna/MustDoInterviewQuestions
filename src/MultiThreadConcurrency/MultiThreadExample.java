package MultiThreadConcurrency;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadExample {
    private final List<Runnable> tasks;
    private int count;

    public MultiThreadExample(List<Runnable> tasks){
        this.tasks=tasks;
        //System.out.println(this.tasks.size());
        executeAllThreads();
    }

    public void executeAllThreads(){
        List<Thread> threads=new ArrayList<>(tasks.size());

        for(Runnable task : tasks){
            Thread thread=new Thread(task);
            thread.setName("name"+count);
            count++;
            threads.add(thread);
        }
         //threads.get(1).start();

        for(Thread thread : threads) {
            //System.out.println("Current thread is "+thread.getName());
            thread.start();
            try {
                //Thread.sleep(10000);
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static class ThreadRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("Current thread is "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        List<Runnable> noOfTasks=new ArrayList<>();
        ThreadRunnable tr1=new ThreadRunnable();
        ThreadRunnable tr2=new ThreadRunnable();
        noOfTasks.add(tr1);
        noOfTasks.add(tr2);
        MultiThreadExample a=new MultiThreadExample(noOfTasks);
    }
}
