public class SumOfDigitToSinleDigit {
  public static int Sum(int n){
    if(n == 0)
      return 0;
    int a = n % 10 + Sum(n / 10);
    if(a > 9)
      return Sum(a);
    return a;
  }
  public static void main(String[] args) {
    int num=998;
    System.out.println(Sum(num));
    
  }
}
