package eight.ForkJoinPool;

import java.util.concurrent.RecursiveTask;

public class FactorialSquareCalculator extends RecursiveTask<Integer> {

private  Integer n;
    public FactorialSquareCalculator(Integer n){
        this.n =n;
    }

    @Override
    protected Integer compute() {
        if(n<1){
            return n;
        }
        FactorialSquareCalculator factorialSquareCalculator = new FactorialSquareCalculator(n-1);
        factorialSquareCalculator.fork();
        return n*n +factorialSquareCalculator.join();
    }
}
