import java.util.*;
import java.util.function.*;
//Creating fluent interfaces using lamdas
//also called cascade method pattern -- train wreck pattern -- builder pattern
class Mailer {
  public static void print(String msg) { System.out.println(msg); }
  public Mailer from(String addr) { print("from"); return this;}
  public Mailer to(String addr) { print("to"); return this;}
  public Mailer subject(String line) { print("subject"); return this;}
  public Mailer body(String msg) { print("body"); return this;}
  public static void send(Consumer<Mailer> block) {
    Mailer mailer = new Mailer();
    block.accept(mailer);
    System.out.println("sending...");
  }
}

public class SampleMailer {
  public static void main(String[] args) {
    Mailer.send(mailer ->
      mailer
        .from("builder@agiledeveloper.com")
        .to("venkats@agiledeveloper.com")
        .subject("Your code sucks")
        .body("...here you go..."));
  }
}

//making send method as higher order function
//by passing function as argument to a function -- pass a function get the data returned from a function
//
