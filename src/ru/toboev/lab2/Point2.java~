//Точка 2-го пространства
package lab2;

public class Point2 extends Point {
    private String surname = " Координаты x, y, с - значение гипотенузы: ";    
    private double x, y, c; //Координаты x, y, с - значение гипотенузы
    private double distanceZero; //Дистанция от начала координат
    Point2(double x, double y) {
       this.x=x;
       this.y=y;
       this.distanceZero=distanceZero;
       c=Math.sqrt(x*x+y*y);
    }
    
    @Override
    public double getX() {
        return x;
    }
    
    @Override
    public double getY() {
        return y;
    }   
    
    public double getC() {
        return c;
    }

    @Override
    public double getDistanceZero() {
        return distanceZero=Math.sqrt((x*x+y*y));
    }

    @Override 
    public String toString() {
        return this.surname+" "+getX()+" "+getY()+" "+getC()+" Дистанция от начала координат до точки 2-го пространства - "
                +this.getDistanceZero();
    }

    @Override
    public double distance(Point p) { //Гипотенуза прямоугольного треугольника
        double x1=((Point2) p).x;     //с катетами X,Y
        double y1=((Point2) p).y;
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }

    public double tangets(Point p) { //Тангенс
        return Math.atan((c/x)/(c/y));
    }

    public double dodecagonArea(Point p) { //Площадь додекагона
        double x1=((Point2) p).x;    
        double y1=((Point2) p).y;
        return 3*(2+Math.sqrt(3))*Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1))
                *Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
    
    @Override
    public void symmetry() { //Реализация метода симметрии относительно начала координат для Point2
        x=-x;
        y=-y;
        
    }

    @Override
    public void movingtovector(Point w) { //Реализация метода перемещения на заданный вектор для Point2
        Point2 p=(Point2) w;
        x = x + p.x;
        y = y + p.y;
    }
}
