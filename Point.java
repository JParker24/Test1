public class Point {
 private int x;
  private int y;

public Point(){
  x=0;
  y=0;
}
public Point(int x1, int y1){
  x=x1;
  y=y1;
}
public void set(int x1, int y1){
   x=x1>0? x1:0;
   y=y1>0? y1:0;
}
public int getX(){
  return x;
}
public int getY(){
  return y;
}
 public void print() {
   System.out.println("("+x+","+y+")");
 }
 public String toString() {
   return "("+x+","+y+")";
 }
 public boolean equals(Point otherPoint) {
 return (x == otherPoint.x && y == otherPoint.y );
 }
 public void copy(Point otherPoint) {
 x = otherPoint.x;
 y = otherPoint.y;
 }
  public Point getCopy() {
 Point temp = new Point();
 temp.x = x;
 temp.y = y;
 return temp;
  }
  public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
  public double distance(Point otherPoint){
  
    return Math.sqrt((x - otherPoint.x) * (x - otherPoint.x) + (y - otherPoint.y) *( y - otherPoint.y));
  }
  public void translate(int dx, int dy) {
    x += dx;
    y += dy;
}
   public boolean isHorizontal(Point otherPoint) {
 return (x == otherPoint.x);
 }
     public boolean isVertical(Point otherPoint) {
 return (y == otherPoint.y);
 }
     public double slope(Point otherPoint){
       return otherPoint.y - y / otherPoint.x - x;
     }
  }
  
