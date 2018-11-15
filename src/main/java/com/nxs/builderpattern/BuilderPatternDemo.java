package com.nxs.builderpattern;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:38
 * @description 建造者模式
 * 建造者模式举例：去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。
 * 我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，
 * 也可以套餐加单点，但是最后一定要点确认来完成订单。
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
