package MD.binarySearch;

public class BSReverseSortedArray {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        System.out.println("find position/index of 8 is : "+doBSReverseSortedArray(arr,8));
    }

    public static int doBSReverseSortedArray(int[] arr,int ele){
        int start=0;int end=arr.length-1;int mid=0;
        while (start<=end){
            mid= start + (end-start)/2; //note: this can lead to infinite loop.
            //System.out.println(mid);

            if(arr[mid]==ele)
                return mid;
            else if(ele<arr[mid])
                start=mid+1;
            else
                end=mid-1;

        }
        return -1;
    }
}
