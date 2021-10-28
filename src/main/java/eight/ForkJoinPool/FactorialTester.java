package eight.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

public class FactorialTester {


    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialSquareCalculator factorialSquareCalculator = new FactorialSquareCalculator(5);
        Integer factorialResult=factorialSquareCalculator.compute();
        System.out.println(factorialResult);

    }
}
