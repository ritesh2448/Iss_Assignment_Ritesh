package Mthread;

public class Synchronisation {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create multiple threads to increment the counter using synchronized methods
        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementSyncMethod();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementSyncMethod();
            }
        });

        // Create multiple threads to decrement the counter using synchronized blocks
        Thread decrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrementSyncBlock();
            }
        });

        Thread decrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrementSyncBlock();
            }
        });

        
        incrementThread1.start();
        incrementThread2.start();
        decrementThread1.start();
        decrementThread2.start();

        // Wait for all threads to finish
        incrementThread1.join();
        incrementThread2.join();
        decrementThread1.join();
        decrementThread2.join();

        
        System.out.println("Final Count: " + counter.getCount());
    }
}



class Counter {
    private int count;
    private Object lock = new Object();

    public synchronized void incrementSyncMethod() {
        count++;
    }

    public synchronized void decrementSyncMethod() {
        count--;
    }

    public void incrementSyncBlock() {
        synchronized (lock) {
            count++;
        }
    }

    public void decrementSyncBlock() {
        synchronized (lock) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}