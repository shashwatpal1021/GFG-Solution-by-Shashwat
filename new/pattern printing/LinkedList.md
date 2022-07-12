
import java.util.ArrayList;

class LinkedList {
    // node
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("linkedlist");
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println(head.data + "-->" + temp1.data + "-->" + temp2.data);

        // or

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);

        // insert at beginning
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        // printlist(head);

        // insert at end
        Node head = null;
        head = insertEnd(head, 5);
        head = insertEnd(head, 4);
        head = delHead(head);
        head = insertEnd(head, 3);
        head = delTail(head);
        head = insertAtpos(head, 2, 50);
        printlist(head);
        System.out.println();
        System.out.println("Position of element in Linked List: " + search(head, 20));
        printMiddle(head);

        printNthFromEnd(head, 2);
        System.out.println();
        // head=revList(head);
        head = revList(head, null); // recursive
        printlist(head);
    }

    // iterative
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // recursive
    public static void printlist(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printlist(head.next);
    }

    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    // delete head Node
    public static Node delHead(Node head) {
        if (head == null)
            return null;
        else
            return head.next;
    }

    // delete tail node
    public static Node delTail(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
    }

    // insert at given position
    public static Node insertAtpos(Node head, int pos, int x) {
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            return head;
        }
        Node curr = head;
        for (int i = 1; i < pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    // search in a linkedlist iterative
    public static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    // recursive
    public static int search(Node head, int x) {
        if (head == null)
            return -1;
        if (head.data == x)
            return 1;
        else {
            int res = search(head.next, x);
            if (res == -1)
                return -1;
            else
                return res + 1;
        }
    }

    public static Node sortedll(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        if (x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }
        temp.next = temp;
        curr.next = temp;
        return head;
    }

    // Naive

    public static void printMiddle(Node head) {
        if (head == null)
            return;
        int count = 0;
        Node curr;
        for (curr = head; curr != null; curr = curr.next)
            count++;
        curr = head;
        for (int i = 0; i < count / 2; i++)
            curr = curr.next;
        System.out.println(curr.data);
    }

    // Efficient

    public static void printMiddle(Node head) {
        if (head == null)
            return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    // Nth Node from end of the linked list

    // method: 1 using length

    public static void printNthFromEnd(Node head, int n) {
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            len++;
        if (len < n)
            return;
        Node curr = head;
        for (int i = 1; i < len - n + 1; i++)
            curr = curr.next;
        System.out.print(curr.data);
    }

    // method : 2 using two pointer approach

    public static void printNthFromEnd(Node head, int n) {
        if (head == null)
            return;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.print(second.data);
    }

    // Reverse a linked list iterative
    // naive
    static Node revList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove((arr.size() - 1));
        }
        return head;
    }
    // efficient

    public static Node revList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Recursiv reverse a linked list part 1

    public static Node revList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node rest_head = revList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    // part 2

    public static Node revList(Node curr, Node prev) {

        if (curr == null)
            return prev;
        Node next = curr.next;
        curr.next = prev;
        return revList(next, curr);
    }

    // Remove duplicates from a sorted Singly Linked List
    Node head;

    void removeDuplicate() {
        Node temp = head, prev = head;
        while (temp != null) {
            if (temp.data != prev.data) {
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if (prev != temp)
            prev.next = null;
    }

    // Reverse a linked list in group of size k
    // 1) recursive

    public static Node reverseK(Node head, int k) {
        Node curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverseK(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    // 2) iterative

    public static Node reverseK(Node head, int k) {
        Node curr = head, prevFirst = null;
        boolean isFirstPass = true;
        while (curr != null) {
            Node first = curr, prev = null;
            int count = 0;
            while (curr != null && count < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                count++;
            }
            if (isFirstPass) {
                head = prev;
                isFirstPass = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }

    // Detect loop

    // 1) change referencees / pointer

    public static boolean isLoop(Node head) {
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                return false;
            }
            if (curr.next == temp) {
                return true;
            }
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }

    // 2) with the help of hashing

    public static boolean isLoop(Node head) {
        HashSet<Node> s = new HashSet<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            if (s.contains(curr))
                return true;
            s.add(curr);
        }
        return false;
    }

    // Detect loop using floyd cycle detection

    public static boolean isLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Detect Remove loop

    public static void detectRemoveLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
            if (slow != fast)
                return;
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }

    // Delete node with only pointer given to it

    public static void deleteNode(Node ptr) {
        Node temp = ptr.next;
        ptr.data = temp.data;
        ptr.next = temp.next;
    }

}
