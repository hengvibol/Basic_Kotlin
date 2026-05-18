package datatype

fun main() {

    // Immutable Array
    val fruits = arrayOf("Apple", "Banana", "Orange", "Mango", "Grape")

    println("Immutable Fruits Array:")
    println(fruits.joinToString())

    // Mutable ArrayList
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    // first()
    println("First Element: ${numbers.first()}")

    //last
    println("Last Element: ${numbers.last()}")

    //size
    println("Array Size: ${numbers.size}")

    //contains()
    println("Contains 3: ${numbers.contains(3)}")

    // indexOf()
    println("Index of 3: ${numbers.indexOf(4)}")

    // joinToString()
    println("Join To String: ${numbers.joinToString()}")

    // reverse()
    numbers.reverse()
    println("Reversed Array: ${numbers.joinToString()}")

    // sort()
    numbers.sort()
    println("Sorted Array: ${numbers.joinToString()}")

    // isEmpty()
    println("Is Empty: ${numbers.isEmpty()}")

    // maxOrNull()
    println("Maximum Value: ${numbers.maxOrNull()}")

    // minOrNull()
    println("Minimum Value: ${numbers.minOrNull()}")

    // average()
    println("Average Value: ${numbers.average()}")

    // sum()
    println("Sum Value: ${numbers.sum()}")


    // Add 2 more numbers
    numbers.add(6)
    numbers.add(7)
    println("\nMutable Number List:")
    println(numbers)

    // Remove 1 number
    numbers.remove(3)


    println("\n After Remove Mutable Number List:")
    println(numbers)
}