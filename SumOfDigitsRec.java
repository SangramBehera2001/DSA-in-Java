public class SumOfDigitsRec {
  public static int Sum(int n){
    if(n == 0)
    return 0;
    int sum = n % 10 + Sum(n / 10);
    return sum;
  }
  public static void main(String[] args) {
    int num = 590;
    int sum = Sum(num);
    System.out.println("Sum is : " + sum);
  }
}
