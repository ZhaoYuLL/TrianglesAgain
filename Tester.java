public class Tester{
  public static void main(String[] args){
    Point p1 = new Point(5,7);
    Point p2 = new Point(6,11);
    Point p3 = new Point(p1);
    System.out.println(p1.distanceTo(p2));
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.equals(p2));
  }
}
