 //import java.util.*;
 class ArrayListImpl {
  
  Object arr[] = new Object[10];
  int index=0;
  public void add(Object ele)
  {
    if(index >= arr.length) increase();
    arr[index] = ele;
    index++;
  }

  private void increase()
  {
    Object []temp = new Object[((arr.length*3)/2 )+ 1];
    for(int i = 0; i<arr.length; i++)
    {
      temp[i] = arr[i];
    }
    arr = temp;
  }

  public int size()
  {
    return index;
  }

  public Object get(int ind)
  {
    if(ind < 0 || ind >= size()) throw new ArrayIndexOutOfBoundsException();
    return arr[ind];
  }

}
  public class ArrayListImplementation{
    public static void main(String [] args){
      ArrayListImpl al = new ArrayListImpl();
  
      al.add(10);
      al.add(20);
      al.add("Gudu");
      System.out.println(al.size());

      for(int i =0; i < al.size(); i++)
      {
        System.out.print(al.get(i) + " ");
      }
  
    }
  }



