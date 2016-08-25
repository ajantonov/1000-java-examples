import java.util.*;
public class Equals {
    public static void main(String...args){
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));
        one.add("a");
        System.out.println(one.equals(two));
        two.add("a");
        System.out.println(one.equals(two));
        one.add("b");
        two.add(0, "b");
        System.out.println(one.equals(two));
    }
}
