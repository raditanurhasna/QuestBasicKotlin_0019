package com.example.questbasickotlin_0019

fun ContohList() {
    println("=== List ===")

    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    shape[0] = "oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}