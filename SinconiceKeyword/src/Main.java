
class Cale{

    int num;

    public synchronized void increment(){
        num++;

    }
        }


public class Main {

    public static void main(String[] args) throws InterruptedException {
      Cale cale = new Cale();

       Thread t1 = new Thread(new Runnable() {
           @Override
            public void run() {
               for (int i = 0; i < 3000; i++) {
                   cale.increment();
               }

           }
       });

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                cale.increment();
            }

        }
    });
 t1.start();
 t2.start();
 t1.join();
 t1.join();

        System.out.println(cale.num);

}

}
