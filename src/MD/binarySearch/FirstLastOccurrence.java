package MD.binarySearch;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,8,9,10};
        System.out.println(getFirstOccurrence(arr,4));
        System.out.println(getLastOccurrence(arr,4));
    }

    public static int getFirstOccurrence(int[] arr,int ele){
        int start=0;int end=arr.length-1;int mid=0;int res=-1;
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

    public static int getLastOccurrence(int[] arr,int ele){
        int start=0;int end=arr.length-1;int mid=0;int res=-1;
        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==ele) {
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]>ele)
                end=mid-1;
            else
                start=mid+1;
        }
        return res;
    }

}
