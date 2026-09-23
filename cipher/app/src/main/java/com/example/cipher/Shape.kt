package com.example.cipher

abstract class Shape (
    val x: Int,
    val y: Int
) {
}

class Circle(x_value: Int, y_value:Int): Shape(x_value, y_value)