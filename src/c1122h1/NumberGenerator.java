package c1122h1;

public class NumberGenerator implements Runnable {
    private Thread myThread;

    public NumberGenerator (){
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }


    public Thread getMyThread() {
        return myThread;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
