package com.company.Utils;

import com.company.Enum.Colors;
import com.company.Shapes.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ShapeFactory {

    private final double MAX_RANDOM_VALUE = 10;

    private String getRandomColor(){
        List<String> colorNameList = Stream.of(Colors.values())
                .map(Enum::name)
                .collect(Collectors.toList());
        int x = (int)(Math.random()*colorNameList.size());
        return colorNameList.get(x);
    }

    private Circle generateRandomCircle(){
        double radius = Math.random()*MAX_RANDOM_VALUE+1;
        String color = getRandomColor();
        return new Circle(radius, color);
    }

    private Square generateRandomSquare(){
        double side = Math.random()*MAX_RANDOM_VALUE+1;
        String color = getRandomColor();
        return new Square(side, color);
    }

    private Triangle generateRandomTriangle(){
        double sideA = Math.random()*MAX_RANDOM_VALUE+1;
        double sideB = Math.random()*MAX_RANDOM_VALUE+1;
        String color = getRandomColor();
        return new Triangle(sideA, sideB, color);
    }

    private Trapezoid generateRandomTrapeze(){
        double sideA = Math.random()*MAX_RANDOM_VALUE + 1;
        double sideB = Math.random()*MAX_RANDOM_VALUE + 1;
        double height =Math.random()*MAX_RANDOM_VALUE + 1;
        String color = getRandomColor();
        return new Trapezoid(sideA, sideB, height, color);
    }

    public BaseShape generateRandomShape(){
        BaseShape shape = null;
        int x = (int)(Math.random()*4 + 1);
        switch (x){
            case 1: shape = generateRandomCircle();
                    break;
            case 2: shape = generateRandomSquare();
                    break;
            case 3: shape = generateRandomTriangle();
                    break;
            case 4: shape = generateRandomTrapeze();
        }
        return shape;
    }
}
