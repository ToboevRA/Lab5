/* Программа для работы с классами различного пространства от 1 до 4-го
  Разработчик: Тобоев Ренат Ахмадович ИВТ-11*/
package lab2;

import java.io.*;
import java.util.*;

public class Lab2 {
   private static int a;
   private static ArrayList<Point> list;
    private static void init() { //Создание и заполнение списка 
        list = new ArrayList<Point>(); 
        list.add(new Point1(3)); 
        list.add(new Point2(1,2)); 
        list.add(new Point3(1,1,5)); 
        list.add(new Point4(1,1,5,8)); 
        list.add(new Point1(2)); 
        list.add(new Point2(0,0)); 
        list.add(new Point3(0,0,4)); 
        list.add(new Point4(0,0,5,4)); 
        list.add(new Point1(-1)); 
        list.add(new Point2(1,1));
        while(list.isEmpty()){
            System.out.println(list.indexOf(list));
        }

    }
    
    public static void display() { //Метод для показа точек
        int number=0;
        for(Point p: list) {
            System.out.println(number +" "+ p);
            number=+1;
        }
    }
    
    private static Point translator(String s) { //Метод для перевода строки в double и интерпретации пользовательского выбора
        String[] a = s.split(" "); //Разделение строки
        double[] a1 = new double[a.length];            

        try {
            for(int i=0; i<a.length; i++){ //Перевод в double
                a1[i]= Double.parseDouble(a[i]);
            }          
        }
        catch(Exception e){ return null;} //Интерпретация нажатия пользователем
        if ((a1.length == 0)||(a1.length >4)) return null;
        else if(a1.length==1) return new Point1(a1[0]);
        else if(a1.length==2) return new Point2(a1[0], a1[1]);
        else if(a1.length==3) return new Point3(a1[0], a1[1], a1[2]);
        else  return new Point4(a1[0], a1[1], a1[2], a1[3]);

    }    
    
    public static void main(String[] args) throws IOException {
    init();
    // Подготовка к выполнению
    InputStreamReader isr = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(isr); 
    for(;;) { //Создание бесконечного цикла
    System.out.println(); 
    System.out.println("Выберите тип сортировки, если встретилась пустая строка, то выход:"); 
    System.out.println("--------------------------------------------------"); 
    System.out.println("1 - по возрастанию"); 
    System.out.println("2 - по убыванию"); 
    System.out.println("3 - по возрастанию имён"); 
    System.out.println("4 - по убыванию имён"); 
    System.out.println("5 - по возрастанию от начала координат"); 
    System.out.println("6 - по убыванию от начала координат"); 
    System.out.println("7 - Удаление элементов");
    System.out.println("8 - Добавление элемент");
    System.out.println("9 - Симметрия");
    System.out.println("10 - Перемещение на заданный вектор");
    System.out.println("--------------------------------------------------");
    String mode = br.readLine(); //чтение с буффера
    if (mode.isEmpty()) break; //цикл заканчивает, когда находит пустую строку
    if (mode.equals("7")) {
        for(;;){
            display();
            System.out.println("Введите индекс для удаления");
            String number = br.readLine();
            if (mode.isEmpty()) break;
            try { 
                int i = Integer.parseInt(number);
                if ((i>-1) && (i<list.size())){
                    list.remove(i);
                };
            } 
            catch(Exception e){
            }
            
        }
    }
    if (mode.equals("8")) { //Добавляет новый элемент в конец ArrayList 
        for(;;) {
            display();
            System.out.println("Введите для добавления точку пространства от 1 до 4 для выхода введите пустую строку");
            String str =br.readLine();
            if (str.isEmpty()) break;
            Point p = translator(str);            
            if (p != null) list.add(p); 
            else System.out.println("Ошибка ввода");
        }
    }
    if (mode.equals("9")) { //Симметрия относительно начала координат изменяется координату на противоположную
        display(); //Вывод данных
        System.out.println("Симметрия относительно начала координат");
        Point1 temp = new Point1(1);
        Point2 temp1 = new Point2(1, 2);
        Point3 temp2 = new Point3(1, 2, 3);
        Point4 temp3 = new Point4(1, 2, 3, 4);
        temp.symmetry();
        temp1.symmetry();
        temp2.symmetry();
        temp3.symmetry();
        System.out.println(temp);
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }
    
    if(mode.equals("10")) { //Пользователь вводит координаты вектора и все точки перемешенаются на него       
        System.out.println("Введите индекс точки для перемещения на заданый вектор"); 
        try {
            String number = br.readLine();
            int index= Integer.parseInt(number);
            Point p = list.get(index);           
            System.out.println("Введите координаты вектора для перемещения на него");
            String str = br.readLine();
            String[] arr = str.split(" ");
            double[] arr1= new double[arr.length];
            for(int i=0; i<arr.length; i++){
            arr1[i]=Double.parseDouble(arr[i]);
            Point w;
            if ((arr1.length > 0)&&(arr1.length <5)) {           
                if(arr1.length==1) w = new Point1(arr1[0]);
                else if(arr1.length==2) w = new Point2(arr1[0], arr1[1]);
                else if(arr1.length==3) w = new Point3(arr1[0], arr1[1], arr1[2]);
                else  w= new Point4(arr1[0], arr1[1], arr1[2], arr1[3]);
                p.movingtovector(w);
                list.set(index, p);
            }
            else System.out.println("Ошибка ввода");
            }
        }
        catch(Exception e){}             
    }
    boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6"); 
    int sortMode = 0; 
    if (mode.equals("3")||mode.equals("4")) sortMode=1; 
    else if (mode.equals("5")||mode.equals("6")) sortMode=2; 
    Collections.sort(list,new SortMode(sortUp,sortMode)); 
    for(Point p: list){ 
    System.out.println(p); 
    
    }
    } 
   }
  }


