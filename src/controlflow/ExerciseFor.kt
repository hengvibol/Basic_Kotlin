package controlflow

fun main(){

    for (i in 1..10) {
        println(i)
    }

    for (i in 1..20) {

        if (i % 2 == 0) {
            println(i)
        }
    }


    val number = 7

    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }

    val fruits = arrayOf("Apple", "Banana", "Orange")

    for (fruit in fruits) {
        println(fruit)
    }

}