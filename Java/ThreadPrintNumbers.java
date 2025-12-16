class ThreadPrintNumbers extends Thread {
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
        ThreadPrintNumbers numbersThread = new ThreadPrintNumbers();
        numbersThread.start();
    }
}
