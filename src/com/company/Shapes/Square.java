package com.company.Shapes;

import com.company.Enum.ShapeType;

import java.text.DecimalFormat;

public class Square extends BaseShape {
    private double side;

    public Square() {
        this.shapeType = ShapeType.SQUARE;
    }

    public Square(double side) {
        this.shapeType = ShapeType.SQUARE;
        this.side = side;
        this.area = calculateArea(side);
    }

    public Square(double side, String color) {
        this.shapeType = ShapeType.SQUARE;
        this.side = side;
        this.color = color;
        this.area = calculateArea(side);
    }

    public void drawShape() {
        System.out.print("Draw the square.");
    }

    public void setSide(double side) {
        this.side = side;
        this.area = calculateArea(side);
    }

    public double getSide() {
        return this.side;
    }

    private double calculateArea(double side) {
        return Math.pow(side, 2);
    }

    public String getShapeInfo() {
        DecimalFormat formattedDoubleValue = new DecimalFormat("#0.000");
        return shapeType.toString() +
                ": area: " + formattedDoubleValue.format(this.area) +
                "  side: " +  formattedDoubleValue.format(this.side) +
                "  color: " + this.color;
    }
}
