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

fun ContohSet() {
    println()
    println("=== Set ===")

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

fun ContohMap() {

    println()
    println("=== Map ===")

    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    shape["Rectangle"] = 4
    println(shape)

    shape.remove("Circle")
    println(shape)

    shape["Square"] = 5
    println(shape)

    val sahpesLocked: Map<String, Int> = shape
    println(sahpesLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}
