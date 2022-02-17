package com.example.affirmations

import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.reflect.typeOf


fun main() {


//    val tri = Triangle()
//
//    println(tri.area())
//}
//
//
//
//
//
//class Triangle() {
//
//    val a: Double = 3.0
//    val b: Double = 4.0
//    val c: Double = 5.0
//    val d: Double = 5.0
//
//    init {
//        println("You have created a triangle")
//    }
//
//
//    fun area() = sqrt(
//        (perimeter() / 2) * ((perimeter() / 2) - a)
//                * ((perimeter() / 2) - b) * ((perimeter() / 2) - c)
//    )
//
//
//    fun perimeter() = a + b + c
//}


//    val matrix1 = arrayOf(
//        arrayOf(1, 2, 3),
//        arrayOf(4, 5, 6),
//        arrayOf(1, 2, 3)
//    )
//
//    println(matrix1.contentDeepToString())
//
//    fun diagDifference(arr: Array<Array<Int>>): Int {
//
//        var leftFacingDownDiagonal = 0
//        var leftUpDiag = 0
//
//        for (i in matrix1.indices) {
//            leftFacingDownDiagonal += matrix1[i][i]
//            leftUpDiag += matrix1[(matrix1.size - (1 + i))][i]
//        }
//        return (Math.abs(leftFacingDownDiagonal - leftUpDiag))
//    }
//
//    println(diagDifference(matrix1))
//
//}


val matrix2 = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6),
    arrayOf(7, 8, 9),
)

println(matrix2.contentDeepToString())

fun diagDifference(arr: Array<Array<Int>>): Int {

    var leftUp = 0
    var leftDown = 0

    for (i in matrix2.indices) {
        leftUp += matrix2[i][i]
        leftDown += matrix2[(matrix2.size - (1 + i))][i]

    }
    return (Math.abs(leftDown-leftUp))

}
println(diagDifference(matrix2))


}














