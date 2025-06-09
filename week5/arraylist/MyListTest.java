package week5.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("First item: " + list.get(0));
        System.out.println("Second item: " + list.get(1));
        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
