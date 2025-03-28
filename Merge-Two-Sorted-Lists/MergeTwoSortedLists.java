/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        // creating a placeHolder node that will help us build the result list 
        ListNode placeHolderNode = new ListNode(0);

        // pointer track current position in the new list 
        ListNode currentPointer = placeHolderNode;

        // seting condition for while loop;  as far as the lists are not empty 
        while (list1 != null && list2 != null) {

            // comparing the vlaues of the lists 
            if (list1.val < list2.val) {

                // if the value of list1 is smaller then i will add it to the new list 
                currentPointer.next = list1;

                // moving to the next node in l1
                list1 = list1.next;
            } else {

                // if the value l2 is smaller or == then i will add it to the new list 
                currentPointer.next = list2;

                // then move to the next node in l2
                list2 = list2.next;
            }

            // move the currentPointer one step forward to add a new number when the while loop goes again
            currentPointer = currentPointer.next;
        }

      // after the above, one of the list should be empty, 
      // then we will attach either of the non empty list to the new list 
        if (list1 != null) {
            currentPointer.next = list1;
        } else {
            currentPointer.next = list2;
        }

        // return the new list
        return placeHolderNode.next;
    }
}


// creating a new starting node to help build the new list

// we will set a pointer to follow along as we are adding nodes

// while the both list1 and list2 still have elements, then we will

// compare the current values in list1 and list2

// and then attach the smaller value to the new list

// then, move forward in the list from which the value was taken

// we will move the pointer forward in the new list

// after the loop, one list might still have some items in it 

// we will add the rest of the non empty list to the new list

// after this we will return the next node after the starting node since last node is dummy
