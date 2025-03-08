
  public class OccuranceLoop2 {
    public static void occurance(String str, char element) {
        int first = -1;
        int last = -1;

        // Single loop to find both first and last occurrence
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == element) {
                if (first == -1) {
                    first = i;  // Set first occurrence only once
                }
                last = i;  // Always update last occurrence
            }
        }

        System.out.println(first);
        System.out.println(last);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaahb";
        occurance(str, 'a');
    }
}


