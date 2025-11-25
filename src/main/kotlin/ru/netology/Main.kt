package ru.netology

fun main() {

    val service =  WallService()
    service.add(Post(id = 1))
    service.add(Post(id = 2))
    service.add(Post(id = 3))

    val update = service.add(Post(id = 4))

    val result = service.update(update)

    println(update)
    println(result)
}