package com.example.interviewpreparation;

// Definition for a singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleDetector {
    
    // Method to detect a cycle in the linked list
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;  // No cycle if the list is empty or contains a single node
        }

        ListNode slow = head;  // Slow pointer
        ListNode fast = head;  // Fast pointer

        // Traverse the list with slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer one step
            fast = fast.next.next;   // Move fast pointer two steps

            // If the two pointers meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false;  // No cycle
    }

    public static void main(String[] args) {
        // Example of a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;  // Creates a cycle (fourth node points to second)

        // Detect cycle in the linked list
        boolean hasCycle = hasCycle(head);
        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
