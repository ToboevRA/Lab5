//Точка 3-го пространства
package lab2;

public class Point3 extends Point {
    private String surname = " Координаты x, y, z: ";
    private double x,y,z; //Координаты x, y, z
    private double distanceZero; //Дистанция от начала координат
    Point3(double x, double y, double c) {
       this.x=x;
       this.y=y;
       this.z=z;
       this.distanceZero=distanceZero;
    }    
    @Override
    public double getX() {
        return x;
    }
    
    @Override
    public double getY() {
        return y;
    }
    
    @Override
    public double getZ() {
        return z;
    }   
    
    @Override
    public double getDistanceZero() {
        return distanceZero=Math.sqrt((x*x+y*y+z*z));
    }
    @Override 
    public String toString() {
        return this.surname+" "+getX()+" "+getY()+" "+getZ()+"Дистанция от начала координато до точки 3-го пространства- "
                +this.getDistanceZero();
    }
    
    @Override
    public double distance(Point p) { //Гипотенуза прямоугольного параллепипеда
        double x1=((Point3) p).x;     //с рёбрами X,Y,Z
        double y1=((Point3) p).y;
        double z1=((Point3) p).z;
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)+(z-z1)*(z-z1));
    }
    
    public double lengthsEdges() { //Сумма длин всех ребёр
        return 4*(x+y+z);
    }
    
    public double squaresSides() { //Сумма всех площадей сторон параллепипеда
        return 2*((x*y)+(x*z)+(x*y));
    }
    
    @Override
    public void symmetry() { //Реализация метода перемещения на заданный вектор для Point3 
        x=-x;
        y=-y;
        z=-z;
    }

    @Override
    public void movingtovector(Point w) { //Реализация метода симметрии относительно начала координат для Point3
	Point3 p=(Point3) w; 
        x = x + p.x;
        y = y + p.y;
        z = z + p.z;
    }
}
