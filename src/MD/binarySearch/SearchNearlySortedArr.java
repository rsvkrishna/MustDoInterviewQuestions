package MD.binarySearch;

public class SearchNearlySortedArr {
    public static void main(String[] args) {
        int[] arr={5,10,30,20,40}; // nearly sorted array, ele can be in i-1,i,i+1 index
        System.out.println("the index of ele 30 is "+doSearchNearlySorted(arr,30));
    }
    public static int doSearchNearlySorted(int[] arr,int ele){
        int start=0;int end=arr.length-1;int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==ele)
                return mid;
            else if(arr[mid-1]==ele)
                return mid-1;
            else if(arr[mid+1]==ele)
                return mid+1;
            else if(arr[mid]<=ele)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
