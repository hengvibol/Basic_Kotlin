package controlflow

fun main() {

    val accounts = listOf(
        BankAccount("U001", "Vibol", 500.0),
        BankAccount("U002", "Dara", 1200.0),
        BankAccount("U003", "Sokha", 800.0)
    )

    for (account in accounts) {
        println("Account: ${account.accountNumber}")
        println("Owner: ${account.ownerName}")
        println("Balance: $${account.balance}")
        println("---------------------")
    }
}

data class BankAccount(
    val accountNumber: String,
    val ownerName: String,
    var balance: Double
)