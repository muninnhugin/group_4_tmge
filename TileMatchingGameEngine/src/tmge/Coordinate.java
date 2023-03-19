package tmge;

public class Coordinate implements Comparable<Coordinate>{
    public int x;
    public int y;
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Coordinate o) {
        // TODO Auto-generated method stub
        if(this.x == o.x && this.y == o.y)  return 0;
        // if(this.x < )
    }
    
}
