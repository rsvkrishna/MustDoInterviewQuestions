package MD.binarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5};
        System.out.println("the index peak element is "+findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr){
        int start=0;int end=arr.length;int mid=0;
        int size=arr.length;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>0 && mid<size-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                    return mid;
                else if(arr[mid]>arr[mid-1])
                    start=mid+1;
                else
                    end=mid-1;
            } else if(mid==0){
                if(arr[0] > arr[1])
                    return 0;
                else
                    return 1;
            } else if(mid==size-1){
                if(arr[size-1]>arr[size-2])
                    return size-1;
                else
                    return size-2;
            }

        }
      return -1;
    }
}
