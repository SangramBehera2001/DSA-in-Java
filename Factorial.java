public class Factorial {
  public static int calcFactorial(int i){
    if (i ==0 || i ==1){
      return 1;
    }
    // int factMinus = calcFactorial(i-1);
    // int fact = i * factMinus;
    // return fact;

    int fact = i * calcFactorial(i-1);
    return fact;

  }
  
  public static void main(String[] args) {
    int n = 5;

    System.out.println(calcFactorial(n));
  }
}
