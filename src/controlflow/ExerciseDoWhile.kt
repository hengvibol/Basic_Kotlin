package controlflow

fun main(){
    var i = 1

    var balance = 1000.0
    var choice: String?

    do {
        println(i)
        i++
    } while (i <= 5)



    do {

        println("===== ATM MENU =====")
        println("1. Check Balance")
        println("2. Withdraw")
        println("3. Exit")

        print("Choose: ")
        choice = readLine()

        when (choice) {

            "1" -> {
                println("Balance: $$balance")
            }

            "2" -> {

                print("Enter Amount: ")
                val amount = readLine()!!.toDouble()

                if (amount <= balance) {
                    balance -= amount
                    println("Withdraw Success")
                } else {
                    println("Insufficient Balance")
                }
            }

            "3" -> {
                println("Thank You")
            }

            else -> {
                println("Invalid Option")
            }
        }

    } while (choice != "3")
}