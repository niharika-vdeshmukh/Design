import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    static Character[] charArray = new Character[] { 'a', 'e', 'i', 'o', 'u'};
    static Integer[] intArray = new Integer[] {1, 2, 3, 4, 5, 6};
    static Boolean[] boolArray = new Boolean[] {true, false, false, true, true};

    public static <P> List<P> arrayToList(P[] arr, List<P> lst)  {
        for(P obj: arr)
            lst.add(obj);
        return lst;
    }

    public static void main(String[] args) {
        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());

    }
}
