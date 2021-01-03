package MD.binarySearch;

public class FindInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,24,35,40};
        findInInfiniteArray(arr,20);
    }
    public static void findInInfiniteArray(int[] arr,int ele){
        int start=0;int end=1;int mid=0;
        while(ele>arr[end]){
            start=end;
            end=2*end;
        }
        System.out.println("index of 20 is at "+doBinarySearchWithPos(arr,ele,start,end));;

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
}
