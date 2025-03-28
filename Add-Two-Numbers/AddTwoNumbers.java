**
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // creating a dummy node that will help us build the result list 
        // the result will begin from dummy.next
        ListNode placeHolderNode = new ListNode(0);

        // this pointer will be used to add new node to the result list
        ListNode currentPointer = placeHolderNode;

        // initializing variable to store carrys from the sum
        int carryOver = 0;

         // looping while there are still digits to process
         // or if there is a carry that will need to be added
        while (l1 != null || l2 != null || carryOver != 0) {


        // ternary operator for getting  the current value from l1 if l1 is done, we will use zero
            int valueOne = (l1 != null) ? l1.val : 0;
            int valueTwo = (l2 != null) ? l2.val : 0;

        // calculating the total sum of both digits and the carry
            int totalSumOfDigits = valueOne + valueTwo + carryOver;
        
        // Extract the digit to store in the new node (ones place)
            carryOver = totalSumOfDigits / 10;

        // creating a new node to store digit value
            currentPointer.next = new ListNode(totalSumOfDigits % 10);

        // we will move the current pointer forward
            currentPointer = currentPointer.next;

        // moving l1 and l2 to the next node if they exist 
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // return the next node
        return placeHolderNode.next;
    }
}




// we will start by creating a dummy node to begin building the result list

// we will keep a pointer at this dummy node to track the current position

// initializing a variable to store any carry from additions

// while there are still digits in either input list or there is a carry:

// we will get the current digit from the first list, or use zero if none

// we will get the current digit from the second list, or use zero if none

// we will add the two digits together along with any carry

// extracting the digit to store in the new node

// update the carry

// we will create a new node with the result digit and attach it to the current position

// then move the current pointer to this new node

// move to the next node in the first list if it exists

// move to the next node in the second list if it exists

// after the loop ends, return the node that comes after the dummy node
