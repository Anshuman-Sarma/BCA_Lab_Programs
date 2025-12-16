class ThreadHelloWorld extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadHelloWorld helloThread = new ThreadHelloWorld();
        helloThread.start();
    }
}
