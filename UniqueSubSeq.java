import java.util.HashSet;

public class UniqueSubSeq {
  public static void subsequences2(String str, int index, String newstr, HashSet<String> set){
    if( index == str.length()){
      if(set.contains(newstr))
          return;
          else{
            System.out.println(newstr);
            set.add(newstr);
            return;
          }
    }
    char currChar = str.charAt(index);

    subsequences2(str, index + 1, newstr + currChar, set);

    subsequences2(str, index + 1, newstr, set);
  }

  public static void main(String[] args) {
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    subsequences2(str, 0, "", set);
  }
}
