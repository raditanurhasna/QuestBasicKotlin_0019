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

fun Contohset() {
    println()
    printlin("=== Set ===")

    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}