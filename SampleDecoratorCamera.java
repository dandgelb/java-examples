import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.awt.*;

@SuppressWarnings("unchecked")
class Camera {
  private Function<Color, Color> filter;
  public Camera(Function<Color, Color>... filters) {
    setFilters(filters);
  }
  public void setFilters(Function<Color, Color>... filters) {
    //filter = color -> color;
    // filter = Stream.of(filters)
    //                .reduce(initial, lamda)
    filter = Stream.of(filters)
                   .reduce(
                      color -> color,
                      (theFilters, aFilter) -> theFilters.andThen(aFilter)
                   );
  }
  public Color snap(Color input) {
    return filter.apply(input);
  }
}

@SuppressWarnings("unchecked")
public class SampleDecoratorCamera {
  public static void printSnap(Camera camera) {
    System.out.println(camera.snap(new Color(125, 125, 125)));
  }
  public static void main(String[] args) {
    printSnap(new Camera());
  }
}
