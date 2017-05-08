package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

public class Chair implements IMakeFurniture {
    @Override
    public void cut() {
        System.out.println("Порізка заготовки на стілець");
    }

    @Override
    public void glue() {
        System.out.println("Склеювання заготовок на стілець");
    }

    @Override
    public void grind() {
        System.out.println("Шліфування стільця");

    }

    @Override
    public void varnish() {
        System.out.println("Лакування стільця");

    }
}
