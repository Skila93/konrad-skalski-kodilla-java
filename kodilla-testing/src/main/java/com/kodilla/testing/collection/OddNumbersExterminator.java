package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumb = new ArrayList<Integer>();
        for (Integer evNumb : numbers){
            if(evNumb % 2 == 0){
                evenNumb.add(evNumb);
            }
        }
        return evenNumb;
    }
}
