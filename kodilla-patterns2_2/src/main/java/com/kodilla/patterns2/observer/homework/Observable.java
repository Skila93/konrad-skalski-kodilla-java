package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void notifyObservers();
    void registerObserver(Observer observer);
    public void removeObserver (Observer observer);
}
