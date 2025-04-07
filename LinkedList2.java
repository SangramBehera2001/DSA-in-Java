import java.util.*;
public class LinkedList2 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);

    list.addLast("this");
    System.out.println(list);

    list.add("list");
    System.out.println(list);

    System.out.println(list.size());

    //Print
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + "->");
    }
    System.out.println("null");

    //Search an value
    for (int i = 0; i < list.size(); i++) {
        if(list.get(i) == "this")
          System.out.println("The Element is found");
    }

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    list.remove(1);
    System.out.println(list);
  }
}
