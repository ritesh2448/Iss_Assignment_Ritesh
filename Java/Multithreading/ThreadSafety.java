package Mthread;

public class ThreadSafety {
    private volatile int sharedVariable = 0; // Shared variable

    public synchronized void incrementSharedVariable() {
        sharedVariable++; // Thread-safe access to instance variable
    }

    public void printLocalVariable() {
        int localVar = 0; // Local variable
        localVar++; // Thread-safe access to local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        ThreadSafety example = new ThreadSafety();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementSharedVariable();
                example.printLocalVariable();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementSharedVariable();
                example.printLocalVariable();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Shared Variable: " + example.sharedVariable);
    }
}
