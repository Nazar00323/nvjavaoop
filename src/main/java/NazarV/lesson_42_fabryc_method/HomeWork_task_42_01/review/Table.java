package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

public class Table implements IMakeFurniture {
    @Override
    public void cut() {
        System.out.println("Порізка заготовки на стіл");
    }

    @Override
    public void glue() {
        System.out.println("Склеювання заготовок на стіл");
    }

    @Override
    public void grind() {
        System.out.println("Шліфування столу");

    }

    @Override
    public void varnish() {
        System.out.println("Лакування столу");

    }
}
