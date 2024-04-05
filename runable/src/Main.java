
public class Main {
    public static void main(String[] args) {

        Thread obj1 = new Thread(() -> {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Kavindu" + i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        });

        Thread obj2 = new Thread(() -> {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Madhuranga" + i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        });

        Thread threadOne = new Thread(obj1);
        Thread threadTow = new Thread(obj2);

        threadOne.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadTow.start();

    }
}