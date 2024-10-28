import java.util.*;
import java.util.LinkedList;

public class ll {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);

        list.addLast("10");
        list.addFirst("0");
        System.out.println(list);

        list.remove("3");
        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        list2.add("Robin");
        list2.add("Raven");
        list2.add(1, "loves");
        System.out.println("previous linkedinlist" + list2);

        list2.set(1, "hate");
        System.out.println("updated linkedlist" + list2);

        list2.remove(1);
        list2.remove("Robin");
        System.out.println("after removal" + list2);
    }
}
