import java.util.ArrayList;

public class ExampleSuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        
        System.out.println(list);
    }
}
