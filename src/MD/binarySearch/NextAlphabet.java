package MD.binarySearch;

public class NextAlphabet{
    public static void main(String[] args) {
        char[] arr={'a','c','f','h'};
        System.out.println("The next alphabet after c is "+findNextAlphabet(arr,'c'));
        System.out.println("The next alphabet after c is "+findNextAlphabet2(arr,'c'));

    }
    public static char findNextAlphabet(char[] arr,char key){
        int start=0;int end=arr.length-1;int mid=0;char res='*';
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==key)
                start=mid+1;
            else if(arr[mid]<key)
                start=mid+1;
            else if(arr[mid]>key){
                res=arr[mid];
                end=mid-1;
            }
        }
        return res;
    }

    public static char findNextAlphabet2(char[] arr,char key){
        int start=0;int end=arr.length-1;int mid=0;char res='*';
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>key){
                res=arr[mid];
                end=mid-1;
            }else
                start=mid+1;
        }
        return res;
    }
}
