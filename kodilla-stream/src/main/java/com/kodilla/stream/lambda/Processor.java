package com.kodilla.stream.lambda;

public class Processor {
    private Executor executor;
    public void execute(Executor executor){
        executor.process();
    }
}
