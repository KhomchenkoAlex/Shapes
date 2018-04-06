package com.company.Utils;

import com.company.Shapes.BaseShape;

import java.util.ArrayList;

public class Util {

    public static ArrayList<BaseShape> generateShapeList(){
        ShapeFactory shapeFactory = new ShapeFactory();
        ArrayList<BaseShape> shapeArrayList = new ArrayList<>();

        int numberOfShapes = (int)(Math.random()*10 + 1);

        for(int i=0; i <= numberOfShapes ; i++){
            BaseShape shape = shapeFactory.generateRandomShape();
            shapeArrayList.add(shape);
        }
        return shapeArrayList;
    }
}