public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c){
     v1 = a;
     v2 = b;
     v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
     v1 = new Point(x1,y1);
     v2 = new Point(x2,y2);
     v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    double lengthA = v1.distanceTo(v2);
    double lengthB = v2.distanceTo(v3);
    double lengthC = v1.distanceTo(v3);
    return lengthA + lengthB + lengthC;
  }

  public double getArea(){
    double lengthA = v1.distanceTo(v2);
    double lengthB = v2.distanceTo(v3);
    double lengthC = v1.distanceTo(v3);
    double semiP = ((lengthA + lengthB + lengthC)/2.0);
    return Math.sqrt(semiP*(semiP - lengthA) * (semiP - lengthB) * (semiP - lengthC));
  }

  public String classify(){
    double lengthA = Math.round(v1.distanceTo(v2) * 10000.0) / 10000.0;
    double lengthB = Math.round(v2.distanceTo(v3) * 10000.0) / 10000.0;
    double lengthC = Math.round(v1.distanceTo(v3) * 10000.0) / 10000.0;
    if(lengthA != lengthB && lengthA != lengthC && lengthB != lengthC) {
        return "scalene";
    }else if (lengthA == lengthB && lengthA == lengthC) {
        return "equilateral";
    }
    return "isosceles";
    //?
  }

  public String toString(){
    return "v1(" + v1.getX() + ", " + v1.getY() + ") " + "v2(" + v2.getX() + ", " + v2.getY() + ") " + "v3(" + v3.getX() + ", " + v3.getY() + ")";
  }
  public void setVertex(int index, Point newP){
    if(index ==0){
      v1 = newP;
    }else if(index ==1){
      v2 = newP;
    }else if(index == 2){
      v3 = newP;
    }

  }


}
