package com.company.Shapes;

import com.company.Enum.ShapeType;
import com.company.Interface.Shape;

abstract public class BaseShape implements Shape {

    ShapeType shapeType;
    String color;
    double area;

    private double calculateArea(){
        return area;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return this.area;
    }

}
