package keerthana.test;

public class Output {
    public static void main(String[] args) {
       /* int i; // variable is not initialized yet.. and has no value currently
        for( i=5;i>10;i++) // i value is initialized to 5 but this loop will never be executed, as i value is 5(i=5) and i>10 which is false(5>10? false)
                          // and hence it will come out of the loop
            System.out.println(i); // this statement will never be executed
        System.out.println(i*4); // i*4 => 5*4 => o/p will be 20*/

        String opCode=null;
        String opCode2="Cancel_code";

        /*if("CANCEL_CODE".equalsIgnoreCase(opCode))
            System.out.println("true");
        else
            System.out.println("false");

        if(opCode.equalsIgnoreCase("CANCEL_CODE"))
            System.out.println("true");
        else
            System.out.println("false");*/

        if(!("CANCEL_CODE".equalsIgnoreCase(opCode)))
            System.out.println("true");
        else
            System.out.println("false");

        if(!("CANCEL_CODE".equalsIgnoreCase(opCode2)))
            System.out.println("true");
        else
            System.out.println("false");



    }
}
