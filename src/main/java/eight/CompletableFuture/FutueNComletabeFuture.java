package eight.CompletableFuture;

import java.util.concurrent.*;

public class FutueNComletabeFuture {




    public static void main(String[] args) {


        System.out.println("I am in " +Thread.currentThread().getName());
        // Integer ad = returning1.thenApplyAsync(returning2).get();
        try {
            Integer g= returning1.get();
            Integer g1= returning1.get();

            System.out.println(getStringFuture("Hi Hello ").get());
            System.out.println(intFuture(10).get());

            System.out.println(g);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }




    }



    private static   ExecutorService executorq = Executors.newFixedThreadPool(3);

    private static Future<Integer> intFuture(Integer input) {
        return executorq.submit(() -> {
            System.out.println(Thread.currentThread().getName()+"I am in integer Future");
            Thread.sleep(1000);
            return input * input;
        });
    }



    private static Future<String> getStringFuture(String string){
        return executorq.submit(()-> {
            System.out.println(Thread.currentThread().getName()+"I am in String Future");
            Thread.sleep(10);
            return string;});
    }








   private static CompletableFuture<Integer> returning1 = CompletableFuture.supplyAsync(()-> {


               System.out.println(Thread.currentThread().getName());
               try {
                   Thread.sleep(3000);
                   System.out.println(Thread.currentThread().getName());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               return 1;
   } ,executorq);


    private static CompletableFuture<Integer> returning2 = CompletableFuture.supplyAsync(()-> {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return 2;
            }


    );


}
