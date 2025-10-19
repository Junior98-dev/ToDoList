package exercice_map;

import java.util.Collections;
import java.util.List;

public class Generique {

    public static Long max(List<? extends Number> numbers){
        long result = 0;
        for (Number n : numbers){
            if (n.longValue() > result){
                result = n.longValue();
            }
        }
        return result;
    };

    public static <T extends Number & Comparable<T>> T getMax(List<T> numbers){
        return Collections.max(numbers);
    }
    public static <T extends Comparable<? super T>> T getMax1(List<T> numbers){
        return Collections.max(numbers);
    }




    public static void main(String[] args) {
        List<Integer> ints = List.of(2, 8, 5);
        List<Double> doubles = List.of(2.3, 8.9, 5.1);
        //System.out.println(max(ints));
        //System.out.println(max(doubles));

        List<String> stringList = List.of("chat", "chien", "zèbre", "abeille");
        System.out.println(getMax1(doubles));
    }
}
