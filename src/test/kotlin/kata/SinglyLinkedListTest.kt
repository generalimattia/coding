package kata

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SinglyLinkedListTest {

    @Test
    fun `should be palindrome`() {
        val firstList = ListNode(value = 1, next = ListNode(2, next = ListNode(value = 2, next = ListNode(value = 1))))
        assertTrue(SinglyLinkedList(firstList).isPalindrome())

        val secondList = ListNode(
            value = 1,
            next = ListNode(
                2,
                next = ListNode(
                    value = 3,
                    next = ListNode(value = 4, ListNode(value = 3, next = ListNode(value = 2, next = ListNode(1))))
                )
            )
        )
        assertTrue(SinglyLinkedList(secondList).isPalindrome())
    }

    @Test
    fun `should not be palindrome`() {
        val listNode = ListNode(value = 1, next = ListNode(2, next = ListNode(value = 3, next = ListNode(value = 4))))
        assertFalse(SinglyLinkedList(listNode).isPalindrome())
    }
}