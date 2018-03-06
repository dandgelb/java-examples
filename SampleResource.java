import java.util.*;
import java.util.function.*;

class Resource {
  public Resource() { System.out.println("created..."); }
  public void op1() { System.out.println("op1"); }
  public void op2() { System.out.println("op2"); }
  public void finalize() { System.out.println("cleanup..."); }
}

public class SampleResource {
  public static void main(String [] args) {
    Resource resource = new Resource();
    resource.op1();
    resource.op2();

  }
}
