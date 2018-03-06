import java.util.*;
import java.util.function.*;
import java.awt.*;

@SuppressWarnings("unchecked")
class Camera {
  private Function<Color, Color> filter;
  public Camera() {
    setFilters();
  }
  public void setFilters(Function<Color, Color>... filters) {
    filter = color -> color;
  }
  public Color snap(Color input) {
    return filter.apply(input);
  }
}

public class SampleDecoratorCamera {
  public static void printSnap(Camera camera) {
    System.out.println(camera.snap(new Color(125, 125, 125)));
  }
  public static void main(String[] args) {
    printSnap(new Camera());
  }
}
