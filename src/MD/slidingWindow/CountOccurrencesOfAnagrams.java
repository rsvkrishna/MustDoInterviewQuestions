package MD.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagrams {

    public static void main(String[] args) {
        String text = "forxxorfxdofr";
        String word = "for";
        System.out.print(countAnagramsS(text, word));
    }

    private static int countAnagramsS(String text,String word){
        int count=0;
        for(int i=0;i<text.length()-word.length();i++){
            //if(checkAnagram(text.substring(i,word.length()),word))
                count++;
        }
        return count;
    }
   /* private static boolean checkAnagram(String a,String b){
        Map<Character,Integer> m= new HashMap<>();
        for(int i=0;i<a.length();i++)
            m[a.charAt(i)]++;
    }*/
}
