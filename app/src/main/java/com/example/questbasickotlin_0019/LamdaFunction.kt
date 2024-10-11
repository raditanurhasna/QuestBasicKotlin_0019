package com.example.questbasickotlin_0019

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
}