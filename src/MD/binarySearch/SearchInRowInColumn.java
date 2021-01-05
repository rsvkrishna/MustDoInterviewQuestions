package MD.binarySearch;

import javafx.util.Pair;

public class SearchInRowInColumn {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,45,},
                     {32,33,39,50}};
        //int[][] arr={{10,20,30,40,60},{15,25,35,45,61},{27,29,37,45,62},{32,33,39,50,63}};System.out.println(arr[0].length+" "+arr.length);
        Pair<Integer,Integer> res=findElementInTwoDSortedArray(arr,29);
        if(res.getKey()!=-1 && res.getValue()!=-1)
            System.out.println("Found the ele at ("+res.getKey()+","+res.getValue()+")");
        else
            System.out.println("Element not found");
    }
    public static Pair<Integer,Integer> findElementInTwoDSortedArray(int[][] arr, int ele){
        int n=arr[0].length;
        int m=arr.length;
        int i=0;int j=m-1;
        while(i>=0 && i<n && j>=0 && j<m){
            if(arr[i][j]==ele)
                return new Pair<>(i,j);
            else if(arr[i][j]>ele)
                j--;
            else if(arr[i][j]<ele)
                i++;
        }
        return new Pair<>(-1,-1);
    }
}
