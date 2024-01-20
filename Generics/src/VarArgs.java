public class VarArgs {

    public static void printItems(String... items) {
        for(int i = 0; i < items.length; i++)
            System.out.println(items[i]);
    }

    public static void main(String[] args) {
        String item1 = "djfd";
        String item2 = "djhdfj";
        String[] itemArray = new String[] {"dsd", "dfdfd", "fjjdfhj"};
        System.out.println("Item1");
        printItems(item1);
        System.out.println("Item2");
        printItems(item2);
        System.out.println("Item 1 and 2");
        printItems(item1, item2);
        System.out.println("Item array");
        printItems(itemArray);
    }
}
