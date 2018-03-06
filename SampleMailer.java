import java.util.*;
import java.util.function.*;

class Mailer {
  public static void print(String msg) { System.out.println(msg); }
  public void from(String addr) { print("from"); }
  public void to(String addr) { print("to"); }
  public void subject(String line) { print("subject"); }
  public void body(String msg) { print("body"); }
  public void send() { System.out.println("sending..."); }
}

public class SampleMailer {
  public static void main(String[] args) {
    Mailer mailer = new Mailer();
    mailer.from("builder@agiledeveloper.com");
    mailer.to("venkats@agiledeveloper.com");
    mailer.subject("Your code sucks");
    mailer.body("...here you go...");
    mailer.send();
  }
}
