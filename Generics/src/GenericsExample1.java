import java.util.ArrayList;
import java.util.List;

public class GenericsExample1 {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Niharika");
        String name = (String)names.get(0);
        System.out.println(name);

        List<String> lst = new ArrayList<>();
        lst.add("Niharika");
        String firstName = lst.get(0);
        System.out.println(firstName);
    }
}
