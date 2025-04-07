class Calculator_Add
{
   void add(int a,int b)
  {
    int s=a+b;
    System.out.println ("Addition of  2 interger value= "+s);
  }
  void add(int a,int b,int c)
  {
    int s=a+b+c;
    System.out.println ("Addition of  3 interger value= "+s);
  }
  void add(double a,double b)
  {
     double s=a+b;
    System.out.println ("Addition of  2 double value= "+s);
  }
  void add(double a,double b,double c)
  {
     double s=a+b+c;
    System.out.println ("Addition of  3 double value= "+s);
  }
}
public class Main3{
   public static void main(String[] args)
  {
     Calculator_Add cal= new Calculator_Add();
     cal.add(4,5);
     cal.add(5,7,9);
     cal.add(5.55,9.55);
     cal.add(4.8747,7.7388,3.85765);
  }
}