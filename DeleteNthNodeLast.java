public class DeleteNthNodeLast {
  int val;
  DeleteNthNodeLast next;
  DeleteNthNodeLast(){}
  DeleteNthNodeLast(int val){
      this.val = val;
  }
  DeleteNthNodeLast(int val, DeleteNthNodeLast next){
      this.val = val;
      this.next = next;
  }

  // Static nested class
  static class Solution {
      public DeleteNthNodeLast removeNthFromEnd(DeleteNthNodeLast head, int n){
          if(head.next == null){
              return null;
          }
          int size = 0;
          DeleteNthNodeLast curr = head;
          while(curr != null){
              curr = curr.next;
              size++;
          }
          if(n == size){
              return head.next;
          }
          int indexToSearch = size - n;
          DeleteNthNodeLast prev = head;
          int i = 1;

          while(i < indexToSearch){
              prev = prev.next;
              i++;
          }
          prev.next = prev.next.next;
          return head;
      }

      public void printList(DeleteNthNodeLast head) {
          while (head != null) {
              System.out.print(head.val + " -> ");
              head = head.next;
          }
          System.out.println("null");
      }
  }

  public static void main(String[] args) {
      // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
      DeleteNthNodeLast n5 = new DeleteNthNodeLast(5);
      DeleteNthNodeLast n4 = new DeleteNthNodeLast(4, n5);
      DeleteNthNodeLast n3 = new DeleteNthNodeLast(3, n4);
      DeleteNthNodeLast n2 = new DeleteNthNodeLast(2, n3);
      DeleteNthNodeLast head = new DeleteNthNodeLast(1, n2);

      Solution sol = new Solution();
      System.out.println("Original List:");
      sol.printList(head);

      int n = 2;
      DeleteNthNodeLast updatedHead = sol.removeNthFromEnd(head, n);
      System.out.println("After removing " + n + "th node from end:");
      sol.printList(updatedHead);
  }
}
