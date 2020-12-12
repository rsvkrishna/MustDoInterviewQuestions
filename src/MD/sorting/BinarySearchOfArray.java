package MD.sorting;

public class BinarySearchOfArray {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1, 2, 3, 4, 5};
        int K = 4;
        System.out.println(binarySearchOfArray(arr,N,K));
    }

    public static int binarySearchOfArray(int arr[], int n, int k){
        int l=0;int u=n; int mid=0;
        while(l<=u){
            mid=(l+u)/2;
            if(arr[mid]==k)
                return mid;

            if(arr[mid]<k){
                l=mid+1;
                //return mid;
            }else
                u=mid-1;
        }

        return 0;
    }
}
