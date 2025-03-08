public class powerStackOfn {
  public static int calcPower(int x, int n){
    if(n ==0){
      return 1;
    }
    if (x ==0){
      return 0;
    }
    int xPown = x * calcPower(x, n-1);
    return xPown;
  }
  public static void main(String[] args) {
    int x =2, n =5;
    System.out.println(calcPower(x, n));
  }
}
