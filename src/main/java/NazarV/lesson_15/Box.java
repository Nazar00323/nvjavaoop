package NazarV.lesson_15;

public class Box {
    private double width;
    private double height;
    private double depth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        if (w == 0) {
            System.out.println("Ширина не може бути рівна 0");
        } else if (w < 0) {
            System.out.println("Ширина не може відємною");
        } else {
            this.width = w;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void volume() {
        double volume = width * height * depth;
        System.out.println("Обєм = " + volume);
    }

}
