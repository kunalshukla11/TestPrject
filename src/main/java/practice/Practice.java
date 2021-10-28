package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        String s = "mmdakkbdd";
        char[] sarr=s.toCharArray();
        Set<Character> repeated = new HashSet<>();


        List<Character> nonRepeated=new ArrayList<>();


        for (int i =0;i<sarr.length;i++){
            char c= sarr[i];
            if(repeated.contains(c)){
                continue;
            }

            if (!nonRepeated.contains(c)){
                nonRepeated.add(c);
            }else{
               // nonRepeated.
                nonRepeated.remove((Character) c);
                repeated.add(c);
            }
        }

        System.out.println(nonRepeated.get(0));


    }
}
