package NazarV.lesson_52;

public class CoordinateDisplay {

    public static void showXY(Coordinates<?> obj) {
        System.out.println("X:Y");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + ":" + obj.coords[i].y);

        }
        System.out.println(" ");
    }

    public static void showXYZ(Coordinates<? extends ThreeD> obj) {
        System.out.println("X:Y:Z");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + ":" +
                    obj.coords[i].y + ":" +
                    obj.coords[i].z);
        }
        System.out.println(" ");
    }

    public static void showXYZT(Coordinates<? extends FourD> obj) {
        System.out.println("X:Y:Z:T");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + ":" +
                    obj.coords[i].y + ":" +
                    obj.coords[i].z + ":" +
                    obj.coords[i].t
            );
        }
        System.out.println(" ");
    }
}
