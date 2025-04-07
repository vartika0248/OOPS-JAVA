class Student
{
   String name;
   int age;
   Student(String n,int a)
   {
      name=n;
      age=a;
   }
   void display()
   {
     System.out.println("Name = "+name);
     System.out.println ("Age = "+age);
   }
}
public class Main2{
     public static void main(String[] args)
     {
        Student stud=new Student("Vartika",22);
        stud.display();
     }
}
