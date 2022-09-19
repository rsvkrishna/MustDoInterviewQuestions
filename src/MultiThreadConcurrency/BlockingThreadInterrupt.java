package MultiThreadConcurrency;

public class BlockingThreadInterrupt {
    public static void main(String[] args) {

        Thread t=new Thread(new BlockingThread());
        t.start();
        t.interrupt();
    }

   private static class BlockingThread implements Runnable{
        @Override
        public void run(){
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("stopping");
            }
        }
    }
}
