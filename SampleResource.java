import java.util.*;
import java.util.function.*;

class Resource implements AutoCloseable {
  public Resource() { System.out.println("created..."); }
  public void op1() { System.out.println("op1"); }
  public void op2() { System.out.println("op2"); }
  public void close() { System.out.println("cleanup..."); }
}

public class SampleResource {
  public static void main(String [] args) {
    //Java 7: ARM - Automatic Resource Management

    try(Resource resource = new Resource()) {
      resource.op1();
      resource.op2();
    }
    //problems
      //easy to forget ++ close()
      //exception - close() will not be called - solved with try and finally
      //not so verbose - now with AutoCloseable
  }
}
