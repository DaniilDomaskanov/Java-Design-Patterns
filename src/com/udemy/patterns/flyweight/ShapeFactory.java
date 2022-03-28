package com.udemy.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String,Shape> shapeMap = new HashMap<>();

    private enum ShapeType {
        CIRCLE {
            Shape getShape() {
                return new Circle();
            }
        }, RECTANGLE {
            Shape getShape() {
                return new Rectangle();
            }
        };
        abstract Shape getShape();
    }

    public static Shape getShape(String name) {
        if(shapeMap.get(name) == null) {
            ShapeType shapeType = ShapeType.valueOf(name.toUpperCase());
            shapeMap.put(name,shapeType.getShape());
        }
        return shapeMap.get(name);
    }
}
