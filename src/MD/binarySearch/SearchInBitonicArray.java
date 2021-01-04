package MD.binarySearch;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        int[] arr={1,3,8,12,4,2};
        int mid=MaximumInBitonicArray.findMaxInBitonic(arr);
        int index=0;
        index=doBinarySearchWithPos(arr,4,0,mid-1);
        if(index==-1)
            index=doBSReverseSortedArrayWithPos(arr,4,mid,arr.length-1);
        System.out.println("the pos of element is at "+index);

    }
    public static int doBinarySearchWithPos(int[] arr,int ele,int s,int e){
        int start=s;int end= e;int mid=0;

        while (start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==ele)
                return mid;
            else if(arr[mid]>ele)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static int doBSReverseSortedArrayWithPos(int[] arr,int ele,int s,int e){
        int start=s;int end=e;int mid=0;
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
