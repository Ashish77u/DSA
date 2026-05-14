class Test {
  int i;
} 
public class Geeks {
   // precondition: x>=0
public void demo(int x)
{
    System.out.print(x % 10);
    if (x % 10 != 0) {
        demo(x / 10);
    }
    System.out.print(x % 10);
}
  public static void main(String args[]) { 
      Test t = new Test(); 
      System.out.println(t.i);
      

      Geeks g = new Geeks();
      g.demo(1234);



   } 
}