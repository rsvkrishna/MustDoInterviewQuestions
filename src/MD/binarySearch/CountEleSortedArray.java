package MD.binarySearch;

public class CountEleSortedArray {
    //using existing logic
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,4,8,9,10};
        int s=FirstLastOccurrence.getFirstOccurrence(arr,4);
        int e=FirstLastOccurrence.getLastOccurrence(arr,4);
        System.out.println("count of element "+((e-s)+1));
    }
}
