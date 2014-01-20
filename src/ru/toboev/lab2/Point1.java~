//Точка одномерного пространства
package lab2;
public class Point1 extends Point {
    private String surname = " Координата x: ";
    private double x; //Координата x
    private double distanceZero; //Дистанция от начала координат
    Point1(double x) {
       this.x=x; 
       this.distanceZero=distanceZero;
    }
    
    @Override
    public double getX() {
        return x;
    } 
        
    @Override
    public double getDistanceZero() {
        return distanceZero=x;
    }
    
    @Override 
    public String toString() {
        return this.surname+" "+getX()+
                " Дистанция от начала координат до точки од-ного пространства - "+this.getDistanceZero();
    }
      
    @Override
    public double distance(Point p) { //Дистанция от системы координат до точки одномерного пространства
        double y=((Point1) p).x;     
        return Math.abs(x-y);
    }
    
    public double half_distance(Point p) { //Половина дистанции от системы координат до точки одномерного пространства
        double y1=((Point1) p).x;                             
        return (Math.abs(x-y1))/2;
    }
    public double HypersphereRadius(Point p) { //Радиус гиперсферы точки одномерного пространства
        double y=((Point1) p).x;     
        return 2*Math.abs(x-y);
    }

    @Override
    public void symmetry() { //Реализация метода симметрии относительно начала координат для Point1
        x=-x;
        
    }
    
    @Override
    public void movingtovector(Point w) { //Реализация метода перемещения на заданный вектор для Point1
        Point1 p=(Point1) w;
        x = x + p.x;
    }   
}

