package io.ravi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello thread : "+Thread.currentThread().getName());

                throw new RuntimeException("Intentional exception");
            }
        });

        thread.setName("New worker thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        Thread.sleep(10000L);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.println("A critical exception in "+thread.getName()+ " the reason is "+throwable.getMessage());
            }
        });

        thread.start();
    }
}
