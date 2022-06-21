package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape Circle;
    Shape Square;
    Shape Triangle;
    ArrayList<Shape> figures = new ArrayList<>();
    public void addFigure(Shape shape){
        figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int figureNumber){
        if(figureNumber >= 0 && figureNumber < figures.size()){
            return figures.get(figureNumber);
        }
        return null;
    }
    public String showFigures(){
        //String figuresString = String.join(", ", figures);
            return "hock";
        }
    }
