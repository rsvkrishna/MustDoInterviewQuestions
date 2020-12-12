package MD.sorting;

public class ElementSortedRotatedArray {
    public static void main(String[] args) {
        //int arr[] = {5,6,7,8,9,10,1,2,3};
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        //int x=10;
        int x=6;
        System.out.println(searchElement(arr,0,arr.length-1,x));

    }

    public static int searchElement(int arr[],int low,int high, int target)
    {
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[low]<=arr[mid]){
            if(target>=arr[low] && target <=arr[mid])
                return searchElement(arr,low,mid-1,target);
            return searchElement(arr,mid+1,high,target);
        }

        if(target >= arr[mid] && target <= arr[high])
            return searchElement(arr,mid+1,high,target);

        return searchElement(arr,low,mid-1,target);
    }
}
