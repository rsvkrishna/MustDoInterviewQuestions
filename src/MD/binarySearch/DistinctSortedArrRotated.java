package MD.binarySearch;

public class DistinctSortedArrRotated {
    public static void main(String[] args) {
        //int[] arr={4,5,6,7,8,9,10,1,2,3};
        int[] arr={4,5,6,7,1,2,3};
        //int[] arr={2,3,4,5,6,7,1};
        System.out.println("how many times the array is rotated = "+ findNoOfRotations(arr));
        // here the the type of rotation, left or right does not matter.
    }

    public static int findNoOfRotations(int[] arr){

        int start=0;int end=arr.length-1;int mid=0;
        int next=0;int prev=0;int size=arr.length;
        while (start<=end){
            if(arr[start] <= arr[end]){
                return start;
            }
            mid=start+ (end-start)/2;
            next=(mid+1)%size;
            prev=(mid-1+size)%size;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
                return mid;

            if(arr[start]<=arr[mid])
                start=mid+1;
            else //if(arr[mid]<=arr[end])
                end=mid-1;

        }
        return -1;
    }
}
