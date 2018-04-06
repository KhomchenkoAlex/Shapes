package com.company;

import com.company.Utils.Util;

public class Main {

    public static void main(String[] args) {
        Util.generateShapeList().forEach(shape -> {
            System.out.println(shape.getShapeInfo());
        });
    }
}