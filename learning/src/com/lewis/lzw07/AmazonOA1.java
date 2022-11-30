package com.lewis.lzw07;


import java.util.ArrayList;
import java.util.List;

//
// related to generate a linked list with some commands
// overall stragety for me:
// keep track of the head and tail of this linkedlist
// with each operation I can just do some modification on head node or the tail node
// for instance:

// when command is PUSH_HEAD:
// First generate this new node with operations and also assign node.next = null
// if (dummy.next == null) which means that this node is empty and I should just assign the new node to head node and tail node as well
// the linked list is empty and when you add one node to this linked list obviously the first node means the last node
// if (dummy.next != null which means that the node is not empty
// - keep track of the current head node and assign the new node's next to the current node and then to make sure the head node equals to this new node

// when the operation is PUSH_TAIL
// also generate this new node given in the second parameter in operation and also assign node.next = null
// if (dummy.next == null) which means that this node is empty and I should just assign the new node to
// if (dummy.next != null) which means that this node is not empty and you can just change the new node as the tail node
// - by assigning the current tail node.next = new node and assign the tail node to the new node

// when the operation is POP_TAIL:
// if the dummy.next == null just assign the dummy.next / dummy.next.next == null
// if dummy.next.next != null this more than 1 element
// you can just assign

// dp solution
// 



public class AmazonOA1 {

    public static ListNode getShoppingCard(ListNode head, List<List<String>> operations) {

        // ListNode dummy = new ListNode(-1);
        // dummy.next = head;

        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        for (int i = 0; i < operations.size(); i++) {

            String command = operations.get(i).get(0);

            if (command.equals("PUSH_HEAD")) {

                int val = Integer.valueOf(operations.get(i).get(1));
                ListNode node = new ListNode(val);

                if (head == null) {
                    head = node;
                    tail = node;
                } else {
                    node.next = head;
                    head = node;
                }

            } else if (command.equals("PUSH_TAIL")) {

                int val = Integer.valueOf(operations.get(i).get(1));
                ListNode node = new ListNode(val);

                if (head == null) {
                    head = node;
                    tail = node;
                } else {
                    tail.next = node;
                    tail = node;
                }

            } else if (command.equals("POP_HEAD")) {

                if (head.next == null) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                }

            }


            if (head == null) {
                System.out.println("空的");
            } else {
                System.out.println(head.val);
            }


        }

        return head;


    }


    public static void main(String[] args) {

        // demo head
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(3);
        node1.next = null;
        head.next = node1;


        List<List<String>> operations = new ArrayList<>();


        List<String> operation = new ArrayList<>();
        operation.add("PUSH_HEAD");
        operation.add("2");
        operations.add(operation);

        List<String> operation1 = new ArrayList<>();
        operation1.add("PUSH_TAIL");
        operation1.add("4");
        operations.add(operation1);

        List<String> operation2 = new ArrayList<>();
        operation2.add("POP_HEAD");
        operation2.add("2");
        operations.add(operation2);

        List<String> operation3 = new ArrayList<>();
        operation3.add("POP_HEAD");
        operation3.add("2");
        operations.add(operation3);

        List<String> operation4 = new ArrayList<>();
        operation4.add("PUSH_HEAD");
        operation4.add("2");
        operations.add(operation4);

        List<String> operation5 = new ArrayList<>();
        operation5.add("POP_HEAD");
        operation5.add("2");
        operations.add(operation5);


        getShoppingCard(head, operations);


    }
}
