package datatype

fun main() {


    // val (Immutable Variables)
    val byteVal: Byte = 10
    val shortVal: Short = 200
    val intVal: Int = 1000
    val longVal: Long = 999999999L
    val floatVal: Float = 10.5F
    val doubleVal: Double = 99.99
    val charVal: Char = 'A'
    val stringVal: String = "Kotlin"
    val booleanVal: Boolean = true
    val uintVal: UInt = 100u

    val intArrayVal = arrayOf(1, 2, 3, 4, 5)

    println("===== val Variables =====")
    println("Byte: $byteVal")
    println("Short: $shortVal")
    println("Int: $intVal")
    println("Long: $longVal")
    println("Float: $floatVal")
    println("Double: $doubleVal")
    println("Char: $charVal")
    println("String: $stringVal")
    println("Boolean: $booleanVal")
    println("UInt: $uintVal")
    println("Array: ${intArrayVal.joinToString()}")

    // var (Mutable Variables)

    var byteVar: Byte = 20
    var shortVar: Short = 300
    var intVar: Int = 2000
    var longVar: Long = 888888888L
    var floatVar: Float = 20.5F
    var doubleVar: Double = 88.88
    var charVar: Char = 'B'
    var stringVar: String = "Programming"
    var booleanVar: Boolean = false
    var uintVar: UInt = 200u

    var intArrayVar = arrayOf(10, 20, 30, 40)

    println("\n===== var Variables (Before Update) =====")
    println("Byte: $byteVar")
    println("Short: $shortVar")
    println("Int: $intVar")
    println("Long: $longVar")
    println("Float: $floatVar")
    println("Double: $doubleVar")
    println("Char: $charVar")
    println("String: $stringVar")
    println("Boolean: $booleanVar")
    println("UInt: $uintVar")
    println("Array: ${intArrayVar.joinToString()}")

    // Update var values
    byteVar = 50
    shortVar = 500
    intVar = 5000
    longVar = 777777777L
    floatVar = 55.5F
    doubleVar = 77.77
    charVar = 'Z'
    stringVar = "Updated Kotlin"
    booleanVar = true
    uintVar = 500u

    intArrayVar[0] = 100

    println("\n===== var Variables (After Update) =====")
    println("Byte: $byteVar")
    println("Short: $shortVar")
    println("Int: $intVar")
    println("Long: $longVar")
    println("Float: $floatVar")
    println("Double: $doubleVar")
    println("Char: $charVar")
    println("String: $stringVar")
    println("Boolean: $booleanVar")
    println("UInt: $uintVar")
    println("Array: ${intArrayVar.joinToString()}")
}