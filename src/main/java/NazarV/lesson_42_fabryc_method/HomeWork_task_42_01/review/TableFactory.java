package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

public class TableFactory implements IFurnitureFactory {
    @Override
    public IMakeFurniture getFurniture() {
        return new Table();
    }
}
