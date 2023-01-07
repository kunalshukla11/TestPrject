package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        String s = "mmdakkbdd";
        char[] SAR=s.toCharArray();
        Set<Character> repeated = new HashSet<>();


        List<Character> nonRepeated=new ArrayList<>();


        for (int i =0;i<SAR.length;i++){
            char c= SAR[i];
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
