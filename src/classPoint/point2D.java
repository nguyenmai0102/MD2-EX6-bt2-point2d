package classPoint;

public class point2D {
    private float x =0.0f;

    private float y = 0.0f;

    public point2D() {
    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x, float y){
        this.x=x;
        this.y=y;

    }
    public float [] getXY (){
        return getXY();
    }

    @Override
    public String toString() {
        return "point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

