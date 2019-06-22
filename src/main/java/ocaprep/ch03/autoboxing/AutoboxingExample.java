package ocaprep.ch03.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);                  // autoboxes the double primitive into a Double object and adds to the weights of type List
        weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0);

        List<Integer> heights = new ArrayList<>();
//        heights.add(null);
        int h = heights.get(0); // NullPointerException

    }
}
