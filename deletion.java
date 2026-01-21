public class deletion {
    Node head; 
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    public static deletion deleteByKey(deletion list, int key) {
        Node currNode = list.head, prev = null;

       
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; 
            return list;
        }

        
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        
        if (currNode == null) return list;

        
        prev.next = currNode.next;
        return list;
    }

    
    public static void printList(deletion list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

   
    public static void main(String[] args) {
        deletion list = new deletion();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(list);

        list = deleteByKey(list, 3);
        System.out.println("\nList after deletion of 3:");
        printList(list);
    }
}