package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

public class FurnitureProduction {
    public static void runFactory(String str) {
        IFurnitureFactory factory = FurnitureProduction.openFactoty(str);
        IMakeFurniture mk = factory.getFurniture();
        mk.cut();
        mk.glue();
        mk.grind();
        mk.varnish();
    }

    public static IFurnitureFactory openFactoty(String type) {
        if (type.equalsIgnoreCase("chair")) {
            return new ChairFactory();
        } else if (type.equalsIgnoreCase("table")) {
            return new TableFactory();

        } else if (type.equalsIgnoreCase("sofa")) {
            return new SofaFactory();
        } else {
            throw new RuntimeException(type +" не знайдено такої фабрики");
        }
    }
}
