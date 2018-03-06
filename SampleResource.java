import java.util.*;
import java.util.function.*;
//Execute around method call pattern  - pre op before methods and post op after methods - Line 22 and 23
class Resource {
  private Resource() { System.out.println("created..."); }
  public Resource op1() { System.out.println("op1"); return this; }
  public Resource op2() { System.out.println("op2"); return this; }
  private void close() { System.out.println("cleanup..."); }
  public static void use(Consumer<Resource> block) {
    Resource resource = new Resource();
    try{
      block.accept(resource);
    } finally {
      resource.close();
    }
  }
}

public class SampleResource {
  public static void main(String [] args) {
    Resource.use(resource ->
                  resource.op1()
                          .op2());
    //problems
      //easy to forget ++ close()
      //exception - close() will not be called - solved with try and finally
      //not so verbose - now with AutoCloseable
  }
}
