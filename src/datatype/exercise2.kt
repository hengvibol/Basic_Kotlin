package datatype
fun main() {

    // Immutable variable
    val appName = "Kotlin Learning App"

    // Mutable variable
    var version = "1.0"

    println("Before Update")
    println("Application: $appName")
    println("Version: $version")

    // First update
    version = "1.1"
    print("First update"+version)

    // Second update
    version = "2.0"

    println("\nAfter Update")
    println("Application: $appName")
    println("Version: $version")
}