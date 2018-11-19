package com.nxs.create.prototype;

import java.util.Hashtable;

/**
 * @author 聂孝爽
 * @date 2018/11/15 17:06
 * @description 原型模式
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * 提供一个获取新实例的方法
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        //提供一个找出正确实例原型的方法
        Shape cachedShape = shapeMap.get(shapeId);
        //委托复制实例的方法生成新实例。
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static  void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
