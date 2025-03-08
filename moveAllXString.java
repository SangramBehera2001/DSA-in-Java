public class moveAllXString {
  public static void moveAllX(String str, int index, int count, String newstr){
    
    if( index == str.length()){   //Base Case
      for(int i =0; i < count; i++)
        newstr += 'x';
        System.out.println(newstr);
        return;
    }
    char currChar = str.charAt(index);
    if(currChar == 'x'){
      count++;
      // moveAllX(str, index+1, count, newstr);
    }
    else {
      newstr += currChar;
    }
    moveAllX(str, index+1, count, newstr);

  }

  public static void main(String[] args) {
    String str = "axbcxxd";
    moveAllX(str, 0, 0, "");
  }
}
