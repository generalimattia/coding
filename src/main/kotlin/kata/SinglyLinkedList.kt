package kata

import java.util.*

data class ListNode(val value: Int, val next: ListNode? = null)

/*
    Given the head of a singly linked list, return true if it is a palindrome.
 */
class SinglyLinkedList(private val head: ListNode?) {

    fun isPalindrome(): Boolean =
        head?.let {
            val stack: Stack<Int> = Stack()
            var nextNode: ListNode? = head

            while (nextNode != null) {
                stack.push(nextNode.value)
                nextNode = nextNode.next
            }

            nextNode = head

            var result = true
            for (i in 0..stack.size / 2) {
                if (nextNode != null && nextNode.value != stack.pop()) {
                    result = false
                    break
                }
                nextNode = nextNode?.next
            }
            result
        } ?: false
}