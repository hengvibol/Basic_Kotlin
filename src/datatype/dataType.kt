package datatype

fun main() {

    val one: Int = 1
    val oneBillion: Int = 1000000000
    val  hexBytes: Long = 0xFF_EC_DE_5E

    val byte: Int = 0b11001001010100100
    val oneByte: Int = 1
    val oneShort: Int = 1

    val oneLong = 1L

    val maybeAbsent: Int? = null


    val pi = 3.14
    val avogadro = 6.02221407e23

    val eFloat = 2.7182817f


    val maybeAbsentDouble: Double? = null


    println(1 + 2) // 3
    println(2_500_000_000L - 1L) // 2499999999
    println(3.14 * 2.71) // 8.5094
    println(10.0 / 3) // 3.3333333333333335


    val intValue = 7/4
    println(intValue)

    val longValue = 5L / 2
    println(longValue) // 2

    val a = 5/2.0
    println(a)

    val  b = 4 / 2.toDouble()
    println(b)


    val x = 1.0
    val xInt = 1
    val xFloat = 1.0f
//    val one: Double = 1 // Error: initializer type mismatch
    println("X : "+x)
//    printDouble(xInt) // Error: argument type mismatch
//    printDouble(xFloat) /: argument type mismatch/ Error


    /*
    ****** Type conversion *****
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
     */

    val cIntValue: Int = 1
    val doubleValue = cIntValue.toDouble()

    println(doubleValue) // 1.0

    val d: Double = 1.5
    val l: Long = d.toLong()

    println(l) // 1

//    print("Enter any word : ")
//    val word = readln()
//    println(word)
//    print("Sum = "+sum(2,3  ))
//    printSum(a = 20,11)

}
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
fun printDouble(x: Int) {
    print("x : " + x)
}

