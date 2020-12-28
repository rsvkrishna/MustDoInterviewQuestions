package MD.stack;

import java.util.Stack;

public class MinStackWithExtraSpace {
    static Stack<Integer> s=new Stack();
    static Stack<Integer> ss=new Stack();

    public static void main(String[] args) {
        msPush(18);msPush(19);msPush(29);
        msPush(15);msPush(16);
        System.out.println(s.toString());
        System.out.println("Min : "+msMin());
        System.out.println("Pop : "+msPop());
        System.out.println("Min : "+msMin());
        System.out.println("Pop : "+msPop());
        System.out.println("Min : "+msMin());
        System.out.println(s.toString());
        System.out.println(ss.toString());
    }

    public static void msPush(Integer a){
        s.push(a);
        if(ss.isEmpty() || a<=ss.peek())
            ss.push(a);
    }

    public static int msPop(){
        Integer a=0;
        if(s.isEmpty())
            return -1;
        a=s.peek();
        s.pop();
        if(a==ss.peek())
            ss.pop();
        return a;
    }

    public static int msMin(){
        return ss.peek();
    }
}
