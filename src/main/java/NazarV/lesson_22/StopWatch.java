package NazarV.lesson_22;

public class StopWatch {
    private long time;
    private long startTime;
    private long endTime;


    public StopWatch() {
        this.time = 0;
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void start(int value) {

    }

    public void pause() {
        this.stop();

    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.time += endTime - startTime;

    }

    public void clear() {
        this.time = 0;
    }

    public long getTime() {

        return time/1000;
    }
    public void showTime(){
        this.stop();
        System.out.println(this.time/1000+" sec");
    }

}
