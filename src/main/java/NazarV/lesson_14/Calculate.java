package NazarV.lesson_14;

public class Calculate {
    public int add(String line){
        int sum = 0;
        //for (int i =0; i < 10; i++)

        for (String args: line.split("\\+")){
            sum+=Integer.valueOf(args);
        }
       return sum;
    }
}