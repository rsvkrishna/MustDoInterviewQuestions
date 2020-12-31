package MD.binarySearch;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,10,1,2,3};
        //int[] arr={4,5,6,7,1,2,3};
        //int[] arr={2,3,4,5,6,7,1};
        int ele=11;
        System.out.println("the element is at = "+ findEleRotatedSorted(arr,ele));
    }

    public static int findEleRotatedSorted(int[] arr,int ele) {

        int indexOfMin=DistinctSortedArrRotated.findNoOfRotations(arr);

        int[] temp=new int[indexOfMin];
        for(int i=0;i<indexOfMin;i++)
            temp[i]=arr[i];

        int res=SimpleBinarySearch.doBinarySearch(temp,ele);

        if(res!=-1)
            return res;
        else{
            int[] temp2=new int[arr.length-indexOfMin];
            for(int i=0;i<arr.length-indexOfMin;i++){
                temp2[i]=arr[indexOfMin];
                indexOfMin++;
            }
            res=SimpleBinarySearch.doBinarySearch(temp2,ele);
            if(res!=-1)
                return res;
        }
        return -1;
    }
}
