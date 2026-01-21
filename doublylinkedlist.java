public class doublylinkedlist {
    Node head; 

    
    static class Node {
        int data;
        Node next;
        Node prev;

        
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public static doublylinkedlist insertAtMiddle(doublylinkedlist list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node slow = list.head;
            Node fast = list.head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            new_node.prev = slow.prev;
            new_node.next = slow;

            if (slow.prev != null) {
                slow.prev.next = new_node;
            } else {
                list.head = new_node; 
            }
            slow.prev = new_node;
        }
        return list;
    }

    
    public static void printList(doublylinkedlist list) {
        Node currNode = list.head;
        System.out.print("Doubly LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    
    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();
        list = insertAtMiddle(list, 1);
        list = insertAtMiddle(list, 2);
        list = insertAtMiddle(list, 3);
        list = insertAtMiddle(list, 4);
        printList(list);
    }
}