package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumb = new ArrayList<Integer>();
        int temporaryValue = 0;
        for (int i = 0; i < numbers.size(); i++){
            temporaryValue = numbers.get(i);
            if(temporaryValue % 2 == 0){
                evenNumb.add(temporaryValue);
            }
        }
        return evenNumb;
    }
}
