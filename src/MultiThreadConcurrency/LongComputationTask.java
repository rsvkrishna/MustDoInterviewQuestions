package MultiThreadConcurrency;

import java.math.BigInteger;

public class LongComputationTask {
    public static void main(String[] args) {
        Thread t=new Thread(new LongRunningTask(new BigInteger("2"),new BigInteger("10")));
        t.start();
        Thread t1=new Thread(new LongRunningTask(new BigInteger("20000000"),new BigInteger("10000000000")));
        t1.start();
        t1.interrupt();
    }

    private static class LongRunningTask implements Runnable{
        BigInteger base;
        BigInteger power;

        public LongRunningTask(BigInteger base, BigInteger power){
            this.base=base;
            this.power=power;
        }
        @Override
        public void run(){
            System.out.println(base+"^"+power+"="+pow(base,power));
        }

        private static BigInteger pow(BigInteger base, BigInteger power){
            BigInteger result =BigInteger.ONE;
            for(BigInteger i=BigInteger.ZERO;i.compareTo(power)!=0;i=i.add(BigInteger.ONE)){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Interrupted prematurely");
                    return BigInteger.ZERO;
                }
                result=result.multiply(base);
            }

            return result;
        }
    }
}
