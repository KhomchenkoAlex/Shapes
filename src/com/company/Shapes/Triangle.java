package com.company.Shapes;

import com.company.Enum.ShapeType;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Triangle extends BaseShape {

    private double sideA;
    private double sideB;
    private double hypotenuse;

    public Triangle() {
        this.shapeType = ShapeType.TRIANGLE;
    }

    public Triangle(double sideA, double sideB) {
        this.shapeType = ShapeType.TRIANGLE;
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = calculateArea(sideA, sideB);
        this.hypotenuse = calculateHypotenuse(sideA, sideB);
    }

    public Triangle(double sideA, double sideB, String color) {
        this.shapeType = ShapeType.TRIANGLE;
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = calculateArea(sideA, sideB);
        this.hypotenuse = calculateHypotenuse(sideA, sideB);
    }

    public void drawShape() {
        System.out.print("Draw the triangle.");
    }

    public void setSides(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = calculateArea(sideA, sideB);
    }

    public List<Double> getSides() {
        List<Double> sides = new ArrayList<>();
        sides.add(this.sideA);
        sides.add(this.sideB);
        return sides;
    }

    private double calculateHypotenuse(double sideA, double sideB){
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    private double calculateArea(double sideA, double sideB) {
        return (sideA * sideB)/2;
    }

    public String getShapeInfo() {
        DecimalFormat formattedDoubleValue = new DecimalFormat("#0.000");
        return shapeType.toString() +
                ": area: " + formattedDoubleValue.format(this.area) +
                "  hypotenuse: " + formattedDoubleValue.format(this.hypotenuse) +
                "  color: " + this.color;
    }
}

