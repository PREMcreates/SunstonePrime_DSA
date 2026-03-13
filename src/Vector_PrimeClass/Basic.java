import java.util.Vector;

public class Basic {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        // adding elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        // printing vector
        System.out.println("Vector elements : " + v);

        // accessing element
        System.out.println("second element is : " + v.get(1));

        // removing element
        v.remove(1); // removes second element

        System.out.println("After removal : " + v);
    }
}
