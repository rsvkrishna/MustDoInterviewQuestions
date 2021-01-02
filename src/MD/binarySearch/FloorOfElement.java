package MD.binarySearch;

public class FloorOfElement {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,24,35,40};
        System.out.println("the floor of 25 is "+findFloorOfElement(arr,25));
        System.out.println("the floor of 24 is "+findFloorOfElement(arr,24));
    }

    public static int findFloorOfElement(int[] arr,int ele){
        int start=0;int end=arr.length;int mid=0;int res=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==ele)
                return arr[mid];
            if(arr[mid]<ele){
                res = arr[mid];
                start = mid+1;
            }else
                end=mid-1;
        }
        return res;
    }
}
