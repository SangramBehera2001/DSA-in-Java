public class SubsequenceStr {
  public static void subsequences(String str, int index, String newstr){
    if( index == str.length()){
      System.out.println(newstr);
      return;
    }
    char currChar = str.charAt(index);

    subsequences(str, index + 1, newstr + currChar);

    subsequences(str, index + 1, newstr);
  }

  public static void main(String[] args) {
    String str = "abc";

    subsequences(str, 0, "");
  }
}
