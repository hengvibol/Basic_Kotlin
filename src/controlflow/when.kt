package controlflow

fun main() {

    print("Enter number of the month:")
    var monthOfCode = readLine()!!.toInt()

    var month = when (monthOfCode) {
        1-> "January"
        2-> "February"
        3-> "March"
        4-> "April"
        5-> "May"
        6-> "June"
        7-> "July"
        8-> "August"
        9-> "September"
        10-> "October"
        11-> "November"
        12-> "December"
        else -> "Not a month of year"
    }
    println(month)

    val code = 200
    val result = handleApi(code)
    println(result)
}

fun handleApi(code: Int) {
    when (code) {
        200 -> success()
        400 -> unauthorized()
        404 -> notFound()
        500 -> serverError()
        else -> unknownError()
    }
}
fun success(){
    println("success")
}
fun unauthorized(){
    println("unauthorized")
}
fun notFound(){
    println("notFound")
}
fun serverError(){
    println("serverError")
}
fun unknownError(){
    println("unknownError")
}

