package NazarV.lesson_52;

public class TwoD  {
    int x,y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TwoD twoD = (TwoD) o;

        if (x != twoD.x) return false;
        return y == twoD.y;
    }

    public int summXY(){
        return x+y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
