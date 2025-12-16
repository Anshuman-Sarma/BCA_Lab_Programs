// AnshumanSarma_WAP to print numbers using multithreading with Runnable interface


class RunnablePrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread numbersThread = new Thread(new RunnablePrintNumbers());
        numbersThread.start();
    }
}
