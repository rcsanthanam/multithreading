package io.ravi.example1;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Worker();
        thread.start();
    }

    public static class Worker extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setName("Local thread");
            System.out.println("Thread name : "+this.getName());
        }
    }

}
