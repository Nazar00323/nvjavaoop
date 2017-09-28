package Exemple_Nazzi;

public class Triangle {

    public static void main(String[] args) {
        int dim = 10;
        for (int i = 0; i < dim; i++){
            for (int k = i; k < dim; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                if (i != dim - 1)
                    if(j == 0 || j == i)
                        System.out.print("*");
                else
                        System.out.print(" ");
                else
                    System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }
    }

}
