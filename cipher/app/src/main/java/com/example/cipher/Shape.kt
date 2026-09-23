package com.example.cipher

abstract class Shape (
    val x: Int,
    val y: Int,
    val color: String = "$PUT_YOUR_CHOICE_OF_COLOR ",
) {
}

class Triangle(x: Int, y: Int, val base: Int, val height: Int): Shape(x, y) {

}
