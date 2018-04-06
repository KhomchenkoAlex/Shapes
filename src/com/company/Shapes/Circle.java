package com.company.Shapes;

import com.company.Enum.ShapeType;

import java.text.DecimalFormat;

public class Circle extends BaseShape {
    private double radius;

    public Circle() {
        this.shapeType = ShapeType.CIRCLE;
    }

    public Circle(double radius) {
        this.shapeType = ShapeType.CIRCLE;
        this.radius = radius;
        this.area = calculateArea(radius);
    }

    public Circle(double radius, String color) {
        this.shapeType = ShapeType.CIRCLE;
        this.radius = radius;
        this.color = color;
        this.area = calculateArea(radius);

    }

    public void drawShape() {
        System.out.print("Draw the circle.");
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = calculateArea(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    private double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getShapeInfo() {
        DecimalFormat formatDoubleValue = new DecimalFormat("#0.000");
        return shapeType.toString() +
                ": area: " + formatDoubleValue.format(this.area) +
                " radius: " + formatDoubleValue.format(this.radius) +
                "  color: " + this.color;
    }
}
