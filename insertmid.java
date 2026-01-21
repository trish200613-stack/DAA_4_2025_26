public class insertmid {
    Node head; // head of list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the middle
    public static insertmid insertAtMiddle(insertmid list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node slow = list.head;
            Node fast = list.head;
            Node prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            prev.next = new_node;
            new_node.next = slow;
        }
        return list;
    }

    // Method to print the linked list
    public static void printList(insertmid list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        insertmid list = new insertmid();
        list = insertAtMiddle(list, 1);
        list = insertAtMiddle(list, 2);
        list = insertAtMiddle(list, 3);
        list = insertAtMiddle(list, 4);
        printList(list);
    }
}