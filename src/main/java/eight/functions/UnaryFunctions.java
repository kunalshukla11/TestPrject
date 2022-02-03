package eight.functions;

import java.util.function.Function;

public class UnaryFunctions {
    //Unary functions
    static final Function<Integer,Integer> addingOne = (x)->{return x+1;};
    static Function<Integer,String> sayHiToNumber = x-> {return "Hi--"+x;};
    static Function<Integer,String> andOneNSayHi=  addingOne.andThen(sayHiToNumber);


    public static void main(String[] args) {
        System.out.println(addingOne.apply(5));
        System.out.println(sayHiToNumber.apply(10));
        //Chaining Functions with andThen
        System.out.println(andOneNSayHi.apply(54));//calling with created 3rd function
        System.out.println(addingOne.andThen(sayHiToNumber).apply(12));//calling directly

        //Chaining Functions with compose
        System.out.println(sayHiToNumber.compose(addingOne).apply(13));



    }
}
