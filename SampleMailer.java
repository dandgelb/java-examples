import java.util.*;
import java.util.function.*;
//Creating fluent interfaces using lamdas - cascade method pattern.
class Mailer {
  public static void print(String msg) { System.out.println(msg); }
  public Mailer from(String addr) { print("from"); return this;}
  public Mailer to(String addr) { print("to"); return this;}
  public Mailer subject(String line) { print("subject"); return this;}
  public Mailer body(String msg) { print("body"); return this;}
  public void send() { System.out.println("sending..."); }
}

public class SampleMailer {
  public static void main(String[] args) {
    new Mailer()
      .from("builder@agiledeveloper.com")
      .to("venkats@agiledeveloper.com")
      .subject("Your code sucks")
      .body("...here you go...")
      .send();
  }
}
