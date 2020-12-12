package MD.sorting;

//this is a recursive solution
public class PeakElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        int index=findPeak(arr, n);
        System.out.println("Index of a peak point is " + index+ " and it's value is "+arr[index]);
    }

    public static int findPeak(int arr[], int n){
        return peakElement(arr, 0, n - 1, n);
    }
    public static int peakElement(int arr[],int l,int u,int n){
        int mid=(l+u)/2;

        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
            return mid;
         else if(mid>0 && arr[mid-1]>arr[mid])
             return peakElement(arr,l,mid-1,n);
         else
             return peakElement(arr,mid+1,u,n);
    }
}
