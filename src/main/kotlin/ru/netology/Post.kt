package ru.netology

data class Post(
    val id: Int = 0,
    val postType: List<String> = listOf("post", "copy", "reply", "postpone", "suggest"),
    val text: String = "Hello, Kotlin!",
    val replyPostId: Int = 11,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
    val singerId: Int = 33,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val isFavorite: Boolean = true,
)
