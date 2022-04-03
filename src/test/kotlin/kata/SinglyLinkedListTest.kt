package kata

import model.ListNode
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SinglyLinkedListTest {

    @Test
    fun `should be palindrome`() {
        val firstList: ListNode? = listOf(1, 2, 2, 1).toLinkedList()
        assertTrue(SinglyLinkedList(firstList).isPalindrome())

        val secondList: ListNode? = listOf(1, 2, 3, 4, 3, 2, 1).toLinkedList()
        assertTrue(SinglyLinkedList(secondList).isPalindrome())
    }

    @Test
    fun `should not be palindrome`() {
        val listNode: ListNode? = listOf(1, 2, 3, 4).toLinkedList()
        assertFalse(SinglyLinkedList(listNode).isPalindrome())
    }
}

fun List<Int>.toLinkedList(): ListNode? =
    if (isEmpty()) {
        null
    } else {
        ListNode(
            value = first(),
            next = subList(1, size).toLinkedList()
        )
    }