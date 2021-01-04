package MD.binarySearch;

public class FirstOneBinaryInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1};
        findChunkInInfiniteArray(arr,1);

    }
    public static void findChunkInInfiniteArray(int[] arr,int ele){
        int start=0;int end=1;int mid=0;
        while(ele>arr[end]){
            start=end;
            end=2*end;
        }
        System.out.println("index of first occurrence "+getFirstOccurrenceInfiniteBinary(arr,ele,start,end));
    }
    
    public static int getFirstOccurrenceInfiniteBinary(int[] arr,int ele,int s,int e){
        int start=s;int end=e;int mid=0;int res=-1;
        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==ele) {
                res=mid;
                end=mid-1;
            }
            else if(arr[mid]>ele)
                end=mid-1;
            else
                start=mid+1;

        }
        return res;
    }
}
