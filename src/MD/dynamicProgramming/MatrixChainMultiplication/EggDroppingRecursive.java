package MD.dynamicProgramming.MatrixChainMultiplication;

public class EggDroppingRecursive {
    public static void main(String[] args) {
        //findMinAttemptsInWhichWeCanFigureOutOnWhichFloorTheEggWillBreak
        System.out.println(minNoOfAttemptEggDrop(1, 3));
        System.out.println(minNoOfAttemptEggDrop(1, 2));
        System.out.println(minNoOfAttemptEggDrop(2, 10));
        System.out.println(minNoOfAttemptEggDrop(3, 26));//this will take time
        //System.out.println(minNoOfAttemptEggDrop(8, 1000));//lot of time
    }
    private static int minNoOfAttemptEggDrop(int eggs,int floor){
        if(floor==0||floor==1)
            return floor;
        if(eggs==1)
            return floor;

        int minVal=Integer.MAX_VALUE;
        for(int k=1;k<=floor;k++){
            int tempVal=1+Math.max(minNoOfAttemptEggDrop(eggs-1,k-1),
                    minNoOfAttemptEggDrop(eggs,floor-k));
            minVal=Math.min(minVal,tempVal);
        }

        return minVal;
    }
}
