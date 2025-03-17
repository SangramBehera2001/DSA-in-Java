public class armstrongnum {
  public static void printArmstrong(int num, int sum){
    if(num == 0){
      System.out.println(sum);
      return;
    }
    int digit = num % 10;
    printArmstrong(num / 10, sum + digit * digit * digit);
  }
  public static void main(String[] args) {
    int num = 153;
    printArmstrong(num, 0);
  }
}
