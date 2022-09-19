package EOPI;

public class ExceptionTesting {
        public static void main(String[] args)
        throws Exception
        {

            try {

                // divide the numbers
                divide(2, 0);
            }

            catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Cause of Exception: "+e.toString());
                System.out.println("Cause of Exception: "+ e.getMessage());
                /*System.out.println("Cause of Exception: "+ e.getMessage());
                System.out.println("Cause of Exception: "+ e.getMessage());
                System.out.println("Cause of Exception: "+ e.getCause());
                System.out.println("Cause of Exception: "+ e.getLocalizedMessage());*/
            }
        }

        // method which divides two number
        public static void divide(int a, int b)
        throws Exception
        {

            try {

                // divide two numbers
                int i = a / b;
            }

            catch (Exception e) {

                // initializing new Exception with cause
                ArithmeticException exe = new ArithmeticException();

                //sexe.initCause(e);

                throw(e);
            }
        }
    }

