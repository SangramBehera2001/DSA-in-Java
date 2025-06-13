package String;

import java.util.ArrayList;

public class RemoveCharInLlist {
  public static void main(String[] args) {
    ArrayList<Character> list = new ArrayList<>();
    list.add('s');
    list.add('a');
    list.add('n');

    System.out.println(list);

    list.remove(0);
    list.remove(Character.valueOf('a'));
    //list.remove('b');
    System.out.println(list);
  }
}
