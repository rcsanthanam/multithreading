package io.ravi.example2;

import java.util.List;

public class Ex1 {

    private final List<Runnable> tasks;

    public Ex1(List<Runnable> tasks){
        this.tasks = tasks;
    }

    public void executeAll(){
        for(Runnable task : tasks){
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
