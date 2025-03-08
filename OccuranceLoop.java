

public class OccuranceLoop
{
    // static int first = -1;
    // static int last = -1;
    public static void occurance(String str,char element){
        int first = -1;
        int last = -1;
        char A[] = str.toCharArray();
        for(int i =0; i < str.length(); i++)
        {
            if(A[i] == element)
            {
            first = i;
            break;
            }
        }
        System.out.println(first);
        
        for(int i =0; i < str.length(); i++)
        {
            if(A[i] == element)
            {
            last = i;
        
            }
        }
        System.out.println(last);
        
    }
	public static void main(String[] args) {
	    String str = "abaacdaefaahb";
	    occurance(str, 'a');
	}
}
