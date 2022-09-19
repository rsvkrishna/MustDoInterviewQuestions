package keerthana.test;

public class AlphabetPattern {
    public static void main(String[] args) {

        /*char ch='P';
        int x=(int)ch;
        System.out.println("ascii value of P "+x);*/

        int k=80; // as ascii value of P is 80

        for(int i=0;i<4;i++){

            for(int j=0;j<=i;j++){
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
}
