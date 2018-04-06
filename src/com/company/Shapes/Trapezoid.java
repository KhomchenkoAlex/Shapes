package com.company.Shapes;

import com.company.Enum.ShapeType;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Trapezoid extends BaseShape{
    private double sideA;
    private double sideB;
    private double height;
    private double midline;

    public Trapezoid() {
        this.shapeType = ShapeType.TRAPEZOID;
    }

    public Trapezoid(double sideA, double sideB, double height) {
        this.shapeType = ShapeType.TRAPEZOID;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.midline = (sideA + sideB)/2;
        this.area = calculateArea(sideA, sideB, height);
    }

    public Trapezoid(double sideA, double sideB, double height, String color) {
        this.shapeType = ShapeType.TRAPEZOID;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.midline = (sideA + sideB)/2;
        this.color = color;
        this.area = calculateArea(sideA, sideB,height);
    }

    public void drawShape() {
        System.out.print("Draw the triangle.");
    }

    public void setSides(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.area = calculateArea(sideA, sideB, height);
    }

    public List<Double> getSidesAndHeight() {
        List<Double> sides = new ArrayList<>();
        sides.add(this.sideA);
        sides.add(this.sideB);
        sides.add(this.height);
        return sides;
    }

    public double getMidline(){
        return this.midline;
    }

    private double calculateArea(double sideA, double sideB, double height) {
        return 0.5*(sideA + sideB)*height;
    }

    public String getShapeInfo() {
        DecimalFormat formattedDoubleValue = new DecimalFormat("#0.000");
        return shapeType.toString() +
                ": area: " + formattedDoubleValue.format(this.area) +
                ": midline: " + formattedDoubleValue.format(this.midline) +
                "  color: " + this.color;
    }
}
