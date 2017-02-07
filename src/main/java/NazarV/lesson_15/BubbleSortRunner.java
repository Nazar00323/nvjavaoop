package NazarV.lesson_15;

public class BubbleSortRunner {
    public static void main(String[] args) {
        BubbleSort b1 = new BubbleSort(100);
        BubbleSort b2 = new BubbleSort(1000);
        BubbleSort b3 = new BubbleSort(10000);
        BubbleSort b4 = new BubbleSort(100000);
        BubbleSort b5 = new BubbleSort(1000000);

        b1.generateArr(1000);
        b2.generateArr(1000);
        b3.generateArr(1000);
        b4.generateArr(1000);
        b5.generateArr(1000);


        b1.sort();
        System.out.print("B1 - ");
        b1.showTime();

        b2.sort();
        System.out.print("B2 - ");
        b2.showTime();

        b3.sort();
        System.out.print("B3 - ");
        b3.showTime();

        b4.sort();
        System.out.print("B4- ");
        b4.showTime();

        b5.sort();
        System.out.print("B5 - ");
        b5.showTime();







    }
}
