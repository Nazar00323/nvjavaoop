package Exemple_Nazzi;

public class TrianglePattern {
    public static void main(String[] args) {
        int i, j;
        int x = 10;
        for (int y = 0; y < x; y++) {
                for (i = y; i < x - 1; i++)
                    System.out.print(' ');

                for (j = 0; j < y * 2 + 1; j++)
                    System.out.print('*');
                System.out.println();

            }
        }
    }





