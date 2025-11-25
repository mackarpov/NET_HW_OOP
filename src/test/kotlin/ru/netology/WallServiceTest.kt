package ru.netology

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {
    @Before
    fun clear() {
        WallService.clear()
    }

    @Test
    fun add() {
        val post =  WallService.add(post = Post())
        assertNotEquals(0, post.id)
    }

    @Test
    fun updateExisted() {
        val editPost =  WallService.add(post = Post(text = "By, Kotlin!"))
        val result = WallService.update(post = Post(id = editPost.id, replyPostId = 10))
        assertTrue(result)
    }

    @Test
    fun updateNotExisted() {
        val editPost =  WallService.add(post = Post(text = "By, Kotlin!"))
        val result = WallService.update(post = Post(id = -1, replyPostId = 10))
        assertFalse(result)
    }

}