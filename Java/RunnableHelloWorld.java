// AnshumanSarma_WAP to demonstrate multithreading using Runnable interface (Hello World)


class RunnableHelloWorld implements Runnable {
    public void run() {
        System.out.println("Hello, World!");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread helloThread = new Thread(new RunnableHelloWorld());
        helloThread.start();
    }
}
