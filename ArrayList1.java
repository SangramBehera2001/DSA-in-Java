import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(9);
    list.add(7);
    list.add(3);
    list.add(1);

    System.out.println(list);

    list.remove(2);

    System.out.println(list);
  }
}
