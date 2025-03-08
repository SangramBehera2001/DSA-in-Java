public class FirstLastOccurance {
  public static int first = -1;//as the indices present starts from 0 which is valid index, so we can't initialise this to 0.
  public static int last = -1;

  public static void occurance(String str, int index, char element){
    // int first = -1; we can't declare it here as each time recursion happens the value will be initialised to -1
    // int last = -1;
    if( index == str.length())
    {
      System.out.println(first);
      System.out.println(last);
      return;
    }
     char currChar = str.charAt(index);
     if(currChar == element)
     {
      if(first == -1){
        first = index;
      }
      else{
        last = index;
      }
     }
     occurance(str, index + 1, element);
  }
  public static void main(String[] args) {
    String str = "abaacdaefaah";
    occurance(str, 0, 'a');
  }
}
