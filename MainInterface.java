interface Bank{
float roi();
}
class sbi implements Bank{
  public float roi()
{
 return 1.5f;
}
}
class pnb implements Bank{
  public float roi(){
  return 1.7f;
}
}
class MainInterface{
public static void main(String[] args){
 Bank b;
 b=new sbi();
 System.out.println(b.roi());
 b=new pnb();
 System.out.println(b.roi());
}
}
