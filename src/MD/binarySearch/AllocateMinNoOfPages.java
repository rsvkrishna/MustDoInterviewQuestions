package MD.binarySearch;

public class AllocateMinNoOfPages {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println("Min of Max number of pages a student can read "+findMinOfMaxAllocatedPages(arr,2));
    }

    public static int findMinOfMaxAllocatedPages(int[] arr,int key){
        int maxOfArray=arr[arr.length-1];
        int sumOfArray=0;int mid=0;int res=-1;
        for(int i=0;i<arr.length;i++)
            sumOfArray=sumOfArray+arr[i];
        //System.out.println(sumOfArray);
        int start=maxOfArray;int end=sumOfArray;
        while (start<=end){
            mid=start+(end-start)/2;
            if(isValidScheme(arr,mid,key)){
                res=mid;
                end=mid-1;
            } else
                start=mid+1;
        }
        return res;
    }

    private static boolean isValidScheme(int[] arr, int max, int key) {
        int student=1;int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if (sum > max){
                student++;
                sum=arr[i];
            }
        }
        if(student==key)
            return true;

        return false;
    }
}
