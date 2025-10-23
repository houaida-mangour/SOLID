package com.directi.training.lsp.example_refactored;


public class RectangleTest
{
    public static void main(String[] args) throws Exception
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        if (rectangle.getWidth() != 5) throw new AssertionError("width mismatch: expected 5 but was " + rectangle.getWidth());
        if (rectangle.getArea() != 20) throw new AssertionError("area mismatch: expected 20 but was " + rectangle.getArea());
        System.out.println("All assertions passed");
    }
}