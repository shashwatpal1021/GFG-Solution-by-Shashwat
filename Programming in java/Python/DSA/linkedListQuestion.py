# A simple Python program for traversal of a linked list

# Node class Implementation LL
class Node:

	# Function to initialise the node object
    # Create a linked list
	def __init__(self, data):
		self.data = data # Assign data
		self.next = None # Initialize next as null


# Linked List class contains a Node object
class Linkedlist:
    def __init__(self):
       self.head = None
       self.last_node = None

    def append(self, data):
        if self.last_node is None:
            self.head = Node(data)
            self.last_node = self.head
        else:
            self.last_node.next = Node(data)
            self.last_node = self.last_node.next

    def display(self):
        curr = self.head
        while curr is not None:
            print(curr.data, end = ' ')
            curr = curr.next


    # Traversing a LinkedList
    def __init__(self):
        self.headvalue = None

    def listprint(self):
        printvalue = self.headvalue
        while printvalue is not None:
            print (printvalue.data)
            printvalue = printvalue.next

    # inserting at the beginning of LL
    def __init__(self):
           self.headvalue = None
    def AtEnd(self,newdata):
         NewNode = Node(newdata)
         if self.headvalue is None:
             self.headvalue = NewNode
             return
         last = self.headvalue
         while(last.next):
             last = last.next
         last.next=NewNode


    # Deletion in a linkedList 
    def deleteNode(self, node):
        node.val = node.next.val
        node.next = node.next.next

    def __init__(self):
        self.head = None
    def Atbegining(self, data_n):
        NewNode = Node(data_n)
        NewNode.next = self.head
        self.head = NewNode
        # removal of key
    def RemoveNode(self, Removekey):
        Headvalue = self.head
        if (Headvalue is not None):
            if (Headvalue.data == Removekey):
                self.head = Headvalue.next
                Headvalue = None
                return
        while (Headvalue is not None):
            if Headvalue.data == Removekey:
                break
            previous = Headvalue
            Headvalue = Headvalue.next
        if (Headvalue == None):
            return
        previous.next = Headvalue.next
        Headvalue = None

    #find middle element of LL in one pass

    def find_middle(node):
          while node:
            current = node
            node = node.next
            second_pointer = node.next
            next_pointer = second_pointer.next
          if next_pointer is None:
              return "Middle node is %s" % str(current)
    
    # OR
    def middleNode(self, head):
        slow=head
        fast=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        return slow

    # Delete Node in a Linked List

    def deleteNode(self, node):
        node.val = node.next.val
        node.next = node.next.next

        TC:O(1)
        SP:O(1)

    # Remove Nth Node From End of List

    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        slow = head
        fast = head

        for _ in range(n):
            fast = fast.next
        if not fast:
            return head.next

        while fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return head

        TC:O(n)
        SP:O(1)

    # Reverse Linked List
        # Recursive
    def reverseList(self, head):
        if not head or not head.next:
            return head

        newHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return newHead
        TC:O(n)
        SP:O(n)

        # Iterative
    def reverseList(self, head):
        prev = None
        curr = head

        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next

        return prev
        TC:O(n)
        SP:O(1)

    # Merge Two Sorted Lists

    def mergeTwoLists(self, list1, list2):
        if not list1 or not list2:
            return list1 if list1 else list2
        if list1.val > list2.val:
            list1, list2 = list2, list1
        list1.next = self.mergeTwoLists(list1.next, list2)
        return list1

        TC:O(list1+list2)
        SP:O(list1+list2)
        # or
    def mergeTwoLists(self, list1, list2):
        res=[]
        while list1:
            res+=[list1.val]
            list1=list1.next
        while list2:
            res+=[list2.val]
            list2=list2.next
        res=(sorted(res)[::-1])
        self.head=None
        for i in range(len(res)):
            node=ListNode(res[i])
            node.next=self.head
            self.head=node
        return self.head
    # Palindrome Linked List

    def isPalindrome(self, head):
        def reverseList(ListNode):
            prev = None
            curr = head

            while curr:
                next = curr.next
                curr.next = prev
                prev = curr
                curr = next

            return prev

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        if fast:
            slow = slow.next
        slow = reverseList(slow)

        while slow:
            if slow.val != head.val:
                return False
            slow = slow.next
            head = head.next

        return True

        TC:O(n)
        SP:O(1)

    # Linked List Cycle
    
    def hasCycle(self, head):
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True

        return False

        TC:O(n)
        SP:O(1)

    # Add Two Numbers
    
    def addTwoNumber(self,l1,l2):
        dummy = ListNode(0)
        curr = dummy
        carry = 0

        while carry or l1 or l2:
            if l1:
                carry += l1.val
                l1 = l1.next
            if l2:
                carry += l2.val
                l2 = l2.next
            curr.next = ListNode(carry % 10)
            carry //= 10
            curr = curr.next

        return dummy.next

        TC:O(n)
        SP:O(1)

    # Odd Even Linked List

    def oddEvenList(self,head):
        oddHead = ListNode(0)
        evenHead = ListNode(0)
        odd = oddHead
        even = evenHead
        isOdd = True

        while head:
            if isOdd:
                odd.next = head
                odd = head
            else:
                even.next = head
                even = head
            head = head.next
            isOdd = not isOdd

        even.next = None
        odd.next = evenHead.next
        return oddHead.next

        TC:O(n)
        SP:O(1)

    # Intersection of Two Linked Lists
    def getIntersectionNode(self, headA, headB):
    	A = set()
		while headA:
			A.add(headA)
			headA = headA.next
		while headB:
			if headB in A: return headB
			headB = headB.next

            #or
    def getIntersectionNode(self,headA,headB):
        a = headA
        b = headB

        while a != b:
            a = a.next if a else headB
            b = b.next if b else headA

        return a

        TC:O(n)
        SP:O(1)

# Convert Binary Number in a Linked List to Integer
def getDecimalValue(self, head):
        a = ''
        while head is not None:
            a += str(head.val)
            head = head.next
        
        return int(a, 2)