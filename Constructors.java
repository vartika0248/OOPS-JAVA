class Name{
  String name;  
  int age;
  Name()
 {
   System.out.println("Object Created"); 
 }
  Name(String S)
 {
   this.name=S;
   System.out.println("Name= "+name);
 }
 Name(String S, int a)
 {
  this.name=S;
  this.age=a;
  System.out.println("Name= "+ name +"  Age= "+age);
 }
}
public class Constructors{
 public static void main(String[] args){
  Name ob1= new Name();
  Name ob2= new Name("Ramesh");
  Name ob3= new Name("Ramesh",40);
}
}