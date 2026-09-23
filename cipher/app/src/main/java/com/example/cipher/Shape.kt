package com.example.cipher

abstract class Shape (
    val x: Int,
    val y: Int,

    val color: String = "yellow"
) {
}

class Triangle(x: Int, y: Int, val base: Int, val height: Int): Shape(x, y) {

}
