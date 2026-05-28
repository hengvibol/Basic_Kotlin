package controlflow

fun main() {

    val correctUsername = "admin"
    val correctPassword = "1234"

    var attempt = 0
    val maxAttempt = 3

    while (attempt < maxAttempt) {

        print("Enter Username: ")
        val username = readLine()

        print("Enter Password: ")
        val password = readLine()

        if (username == correctUsername && password == correctPassword) {
            println("Login Successful")
            break
        } else {
            attempt++
            println("Incorrect username or password")

            if (attempt == maxAttempt) {
                println("Account Locked")
            }
        }
    }
}