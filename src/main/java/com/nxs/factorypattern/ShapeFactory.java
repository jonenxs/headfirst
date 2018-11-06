package com.nxs.factorypattern;

/**
 * @author 聂孝爽
 * @date 2018/11/6 14:09
 * @description
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
