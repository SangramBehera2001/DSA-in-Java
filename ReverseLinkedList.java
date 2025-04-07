
public class ReverseLinkedList{
  Node head;
  private int size;
  ReverseLinkedList(){
    this.size = 0;
  }
    class Node{
      String data;
      Node next;
      Node (String data)
      {
        this.data = data;
        this.next = null;
        size++;
      }
    }
    //Add element at first
    public void addFirst(String data)
    {
      Node newNode = new Node(data);
      if(head == null)
        {
          head = newNode;
          return;
        }
      newNode.next = head;
      head = newNode;
    }
      //Add element at last
      public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
          currNode.next = newNode;
      }
      //Delete First element
      public void deleteFirst(){
        if(head == null){
          System.out.println("The list is empty");
          return;
        }
        size--;
        head = head.next;
      }
      //Delete Last element
      public void deleteLast(){
        if(head == null){
          System.out.println("The list is empty");
          return;
        }
        size--;
        if(head.next == null){
          head = null;
          return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
          lastNode = lastNode.next;
          secondLast = secondLast.next;
        }
        secondLast.next = null;
      }
     
      //Print The LinkedList
      public void printList(){
        if(head == null){
          System.out.println("The List is Empty");
          return;
        }
        Node currNode = head;
        while(currNode != null){
          System.out.print(currNode.data + "->");
          currNode = currNode.next;
        }
        System.out.println("null");
      }
     
      //Size Of the LinkedList
      public int getSize(){
        return size;
    }

      //Reverse the LinkedList (Iterative Approach)
      public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
          Node nextNode = currNode.next;
          currNode.next = prevNode;

          //Update
          prevNode = currNode;
          currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
      }

      //Reverse the LinkedList (Recursive Approach)
      public Node reverseRecurvise(Node head){
        if(head == null || head.next == null){
          return head;
        }
        Node newHead = reverseRecurvise(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
      }

      public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        // list.reverseIterate();
        // list.printList();
        //System.out.println(list.getSize());

        list.head = list.reverseRecurvise(list.head);
        list.printList();
      }
      }
    

