//Абстрактный класс точка
package lab2;

public abstract class Point implements SymmetryByOrigin, MovingToAGivenVector { //Подключение интерфейсов
        private String name = " Точка ";
        private double x, y, z, t;
        private int id;
        private static int nextId=1;
        private double distanceZero; //Дистанция от начала координат
        public abstract double distance(Point p);
    { id = nextId++; }    
    public double getX() { 
        return x; 
    }

    public double getY() { 
        return y; 
    }

    public double getZ() { 
        return z; 
    }

    public double getT() { 
        return t; 
    }

    public int getId() { 
    return id; 
    }  
    
     public double getDistanceZero() { //метод для взятия расстояния о начала координат
        return distanceZero;
    }
    
    public void setName(String n) { 
        name=n; 
    }

    public String getName() { 
        return name; 
    }
 
}





