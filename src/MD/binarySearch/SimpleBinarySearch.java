package MD.binarySearch;

public class SimpleBinarySearch {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};

        System.out.println("find position/index of 2 is : "+doBinarySearch(arr,2));

    }

    public static int doBinarySearch(int[] arr,int ele){
        int start=0;int end=0;int mid=0;
        end= arr.length-1;

        while (start<=end){
            mid=(start+(end-start))/2;

            if(arr[mid]==ele)
                return mid;
            else if(arr[mid]>ele)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
