package NazarV.lesson_15;

import java.util.Random;

public class BubbleSort {
    private int sizeArr;
    private int[] numbers;
    private int time;

    public BubbleSort() {
        this.sizeArr = 100;
        this.numbers = new int[this.sizeArr];
        this.time = 0;
    }

    public BubbleSort(int sizeArr) {
        this.sizeArr = sizeArr;
        this.numbers = new int[this.sizeArr];
        this.time = 0;

    }

    public void generateArr(int max) {
        Random numb = new Random();
        for (int i = 0; i < sizeArr; i++) {
            numbers[i] = numb.nextInt(max);
        }
    }

    public void sort() {
        boolean swapped = true;
        int z = 0;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1 - z; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int a = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = a;
                    swapped = true;
                }
            }
            z++;
        }
    }

    public void show() {
        for (int i = 0; i < this.sizeArr; i++) {
            System.out.print(this.numbers[i] + " ");
        }
        System.out.println("");
    }


}











