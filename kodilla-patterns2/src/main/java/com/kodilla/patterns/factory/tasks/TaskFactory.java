package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String morningShopping = "Morning shopping";
    public static final String fencePainting = "Fence painting";
    public static final String officeCommuting = "Office commuting";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case morningShopping:
                return new ShoppingTask("Morning shopping", "Bread", 1);
            case fencePainting:
                return new PaintingTask("Fence painting", "black", "Fence");
            case officeCommuting:
                return new DrivingTask("Office commuting", "Office", "Bike");
            default:
                return null;
        }
    }
}
