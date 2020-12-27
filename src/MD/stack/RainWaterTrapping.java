package MD.stack;

import java.util.Arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4}; //o/p 10
        //int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; //o/p 6
        int size=arr.length;
        System.out.println(findRainTrapped(arr,size));
    }

    public static int findRainTrapped(int[] arr,int size){
        //have to constuct maxL maxR water arrays
        int maxL[]=new int[size];
        int maxR[]=new int[size];
        int water[]=new int[size];
        int sum=0;

        maxL[0]=arr[0];

        for(int i=1;i<size;i++)
            maxL[i]=Math.max(maxL[i-1],arr[i]);

        System.out.println("maxL"+Arrays.toString(maxL));

        maxR[size-1]=arr[size-1];

        for(int i=size-2;i>=0;i--)
            maxR[i]=Math.max(maxR[i+1],arr[i]);

        System.out.println("maxR"+Arrays.toString(maxR));

        for(int i=0;i<size;i++)
            water[i]=Math.min(maxL[i],maxR[i])-arr[i];

        System.out.println("water"+Arrays.toString(water));

        for(int i=0;i<size;i++)
            sum=sum+water[i];

        return sum;
    }
}
