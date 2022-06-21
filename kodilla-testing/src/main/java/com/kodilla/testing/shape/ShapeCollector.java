package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
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
        }else {
            return null;
        }
    }
    public String showFigures() {
            String figuresString = figures.toString();
        return figuresString;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}
