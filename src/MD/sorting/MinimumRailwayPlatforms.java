package MD.sorting;

import java.util.Arrays;

public class MinimumRailwayPlatforms {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n=arr.length;
        System.out.println(mimPlat(arr,dep,n));
        System.out.println(mimPlatEff(arr,dep,n));
    }
    public static int mimPlatEff(int arr[],int dep[],int n) {

        //use merge sort or quicksort, for now using arrays.sort
        Arrays.sort(arr);Arrays.sort(dep);
        int plat=1;
        int res=1;
        int i=1;int j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
            }else{
                plat--;
                j++;
            }
            res=Math.max(res,plat);
        }
        return res;
    }
    //Brute force
    public static int mimPlat(int arr[],int dep[],int n){
        int plat_needed = 1;
        int result = 1;
        int i=1;
        int j=0;

        for (i=0;i<n;i++) {
            plat_needed = 1;
            for (j=i+1;j<n;j++) {
                if ((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <= dep[i]))
                    plat_needed++;
            }
            result = Math.max(result, plat_needed);
        }
        return result;
    }
}
