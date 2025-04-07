//import java.util.Scanner;
class Car{
  String  brand;
  String color;
  int speed;
 void display ()
  {
   System.out.println ("Car Brand= "+brand);
   System.out.println("Car Colour= "+color);
   System.out.println ("Car Speed= "+speed);
 }
}
public class Main1{
      public static  void main(String[] args)
     {
         Car c=new Car();
         c.brand="Toyota";
         c.color="Yellow";
         c.speed=120;
         c.display();
    }
}