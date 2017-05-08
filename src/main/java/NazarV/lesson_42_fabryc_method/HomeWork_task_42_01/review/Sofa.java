package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

public class Sofa implements IMakeFurniture {
    @Override
    public void cut() {
        System.out.println("Порізка заготовки на диван");
    }

    @Override
    public void glue() {
        System.out.println("Склеювання заготовок на диван");
    }

    @Override
    public void grind() {
        System.out.println("Шліфування дивану");

    }

    @Override
    public void varnish() {
        System.out.println("Лакування дивану");

    }
}
