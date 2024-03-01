import java.lang.Math;

public class Coordinate implements Comparable<Coordinate>{
    private final int x;
    private final int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public double getDistanceToOriginPoint(){
        return Math.hypot(x, y);
    }

    public boolean equals(Object object){
        return (object instanceof Coordinate);
    }

    public void print(){
        System.out.println(x + ", " + y);
    }

    public int compareTo(Coordinate other){
        if(getDistanceToOriginPoint() < other.getDistanceToOriginPoint()){
            return 1;
        }else if(getDistanceToOriginPoint() > other.getDistanceToOriginPoint()){
            return -1;
        }else{
            return 0;
        }
    }
}
