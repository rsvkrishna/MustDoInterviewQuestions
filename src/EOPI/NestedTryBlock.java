package EOPI;

public class NestedTryBlock{
    public static void main(String args[]){
        try{
            int a[]=new int[5];

            a[5]=4;

            System.out.println("other statement");
        }
        catch(Exception e)
        {
            System.out.println("1. handled the exception (outer catch)");
            try{
                System.out.println("2. inside outer catch try");
                int a[]=new int[5];

                a[5]=4;
            } catch (Exception cex){
                System.out.println("3. inside outer catch catch");
            }
            System.out.println("4. inside outer catch catch after inner catch");
        }

        System.out.println("5. normal flow..");
    }
}
