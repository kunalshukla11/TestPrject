package eight.lambda;

public class LambdaTest {

    public static void main(String args[]) {
        LambdaTest tester = new LambdaTest();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;


        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);



        JustSayAMsg justSayAMsg = ()-> {
            return "I am just saying msg";};



        System.out.println(justSayAMsg.say());;

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface JustSayAMsg {
        String say();
    }
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}