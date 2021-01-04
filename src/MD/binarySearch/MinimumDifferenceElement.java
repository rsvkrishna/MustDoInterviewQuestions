package MD.binarySearch;

public class MinimumDifferenceElement {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,24,35,40};
        System.out.println("the ele with min difference is "+findMinimumDifference(arr,22));
    }

    public static int findMinimumDifference(int[] arr,int ele){
        int start=0;int end=arr.length;int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==ele)
                return arr[mid];
            else if(arr[mid]<=ele)
                start=mid+1;
            else
                end=mid-1;
        }
        System.out.println("start "+start+" end "+end);
        if((ele-arr[end]) > (arr[start]-ele))
            return arr[start];//(arr[start]-ele);
        else
            return arr[end];//(ele-arr[end]);

    }
}
