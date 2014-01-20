//Точка 4-го пространства
package lab2;

public class Point4 extends Point {
    private String surname = " Координаты x, y, z, t: ";
    private double x,y,z,t,a; //Координаты x, y, z, t
    private double distanceZero; //Дистанция от начала координат
    
    Point4(double x, double y, double z, double t) {
       this.x=x;
       this.y=y;
       this.z=z;
       this.t=t;
       this.a=a;
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
    public double getT() {
        return t;
    }    
    
    @Override
    public double getDistanceZero() {
        return distanceZero=Math.sqrt((x*x+y*y+z*z+t*t));
    }

    @Override 
    public String toString() {
        return this.surname+" "+getX()+" "+getY()+" "+getZ()+" "+getT()+" Дистанция от начала координато до точки 3-го пространства -  "
                +this.getDistanceZero();
    }

    @Override
    public double distance(Point p) {//Гипотенуза фигуры 4-го пространства
        double x1=((Point4) p).x;    
        double y1=((Point4) p).y;
        double z1=((Point4) p).z;
        double t1=((Point4) p).t;
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)+(z-z1)*(z-z1)+(t-t1)*(t-t1));
        
    }

    public double the_scalar_product(Point p) { //Скалярное произведение
        double x1=((Point4) p).x;
        double y1=((Point4) p).y;
        double z1=((Point4) p).z;
        double t1=((Point4) p).t;
        return (x*x1)+(y*y1)+(z*z1)+(t*t1);
    }

    public double vector_product(Point p) { //Угол векторого произведения
        double x1=((Point4) p).x;
        double y1=((Point4) p).y;
        double z1=((Point4) p).z;
        double t1=((Point4) p).t;
        return Math.acos((x*x1+y*y1+z*z1+t*t1)
               /(Math.sqrt(x*x+y*y+z*z+t*t))*(Math.sqrt(x1*x1+y1*y1+z1*z1+t1*t1)));
    }

    @Override
    public void symmetry() { //Реализация метода перемещения на заданный вектор для Point4
        x=-x;
        y=-y;
        z=-z;
        t=-t;
    }

    @Override
    public void movingtovector(Point w) { //Реализация метода симметрии относительно начала координат для Point4
	Point4 p=(Point4) w;
        x = x + p.x;
        y = y + p.y;
        z = z + p.z;
        t = t + p.t;
   }
}
