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
        // Node head=new Node(10);
        // Node temp1=new Node(20);
        // Node temp2=new Node(30);
        // head.next=temp1;
        // temp1.next=temp2;
        // System.out.println(head.data+"-->"+temp1.data+"-->"+temp2.data);

        // or

        // Node head=new Node(10);
        // head.next=new Node(20);
        // head.next.next=new Node(30);
        // printlist(head);

        // insert at beginning
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        // printlist(head);

        // insert at end
        // Node head=null;
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
    }
    // iterative
    // public static void printlist(Node head){
    // Node curr = head;
    // while(curr!=null){
    // System.out.print(curr.data+" ");
    // curr=curr.next;
    // }
    // }

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
    // public static int search(Node head,int x) {
    // int pos=1;
    // Node curr=head;
    // while(curr!=null){
    // if(curr.data==x)
    // return pos;
    // else{
    // pos++;
    // curr=curr.next;
    // }
    // }
    // return -1;
    // }
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

    // public static void printMiddle(Node head) {
    //     if (head == null)
    //         return;
    //     int count = 0;
    //     Node curr;
    //     for (curr = head; curr != null; curr = curr.next)
    //         count++;
    //     curr = head;
    //     for (int i = 0; i < count / 2; i++)
    //         curr = curr.next;
    //     System.out.println(curr.data);
    // }

    //Efficient

    public static void printMiddle(Node head) {
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }


    // Nth Node from end of the linked list

    // method: 1 using length

    // public static void printNthFromEnd(Node head,int n) {
    //     int len=0;
    //     for(Node curr=head;curr!=null;curr=curr.next)
    //         len++;
    //     if(len<n)
    //         return;
    //     Node curr=head;
    //     for(int i=1;i<len-n+1;i++)
    //         curr=curr.next;
    //     System.out.print(curr.data);
    // }

    // method : 2 using two pointer approach

    public static void name() {
        
    }

}