
public class Test {
    public static void main(String[] args) {
       MyTest myTest = new MyTest();
       MyTest2 myTest2 = new MyTest2();

       myTest.start();
       myTest2.start();
    }
}

//class Test1 extends Thread {
//    @Override
//    public void run() {
//        System.out.println("inside thread 1");
//    }
//}

class MyTest extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Kavindu" + i);
        }
    }
}

class MyTest2 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Madhuranga" + i);
        }
    }
}

