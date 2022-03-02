package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MsysTest {
    public static void main(String[] args) {


    int [] arr= {1,2, 3,4,5,6,7,8,9,10};
    int[] tempArr= new int[3];
    for(int i =0; i < 3; i++){
        tempArr[i]=arr[i];
    }
    for(int i =0;i <7; i++ ){
        arr[i]=arr[i+3];
    }
    int counter= 7;
        for (int x: tempArr) {
            arr[counter]=x;
            counter++;
        }

    }
   Consumer<>
}
