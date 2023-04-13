import PC.pc;

public class SemaPhore {
    public static void main(String[] args) throws InterruptedException {

        final  pc PC = new pc();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.producer();
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consumer();
            }
        });
          System.out.println("Began Thread1: "  );
          System.out.println("Run Thread2: ");


        // Start both threads
        t1.start();
        t2.start();
         System.out.println("Threadt1+ Threadt2:");
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
}

