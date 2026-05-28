package controlflow

fun main(){
    var i = 1
    val correctPassword = "1234"
    var attempt = 0

    while (i <= 5) {
        println(i)
        i++
    }

    while (attempt < 3) {

        print("Enter Password: ")
        val password = readLine()

        if (password == correctPassword) {
            println("Login Success")
            break
        } else {
            println("Wrong Password")
        }

        attempt++
    }

    if (attempt == 3) {
        println("Account Locked")
    }


}