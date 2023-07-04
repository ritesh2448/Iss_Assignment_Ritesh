package Mthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorExample {
	    public static void main(String[] args) {
	        // Create a ThreadPoolExecutor with a fixed pool size
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        // Submit tasks to the executor
	        executor.submit(new MyRunnable("Task 1"));
	        executor.submit(new MyRunnable("Task 2"));
	        executor.submit(new MyRunnable("Task 3"));
	        executor.submit(new MyRunnable("Task 4"));
	        executor.submit(new MyRunnable("Task 5"));

	        
	        executor.shutdown();
	    }

	    static class MyRunnable implements Runnable {
	        private final String name;

	        public MyRunnable(String name) {
	            this.name = name;
	        }

	        public void run() {
	            System.out.println("Executing " + name + " in thread " + Thread.currentThread().getName());
	            
	        }
	    }
	}
