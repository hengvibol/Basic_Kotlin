package datatype
typealias StudentName = String
typealias StudentAge = Int
typealias Score = Double
typealias Numbers = Array<Int>

fun displayStudent(name: StudentName, age: StudentAge) {
    println("Student Name: $name")
    println("Student Age: $age")
}


fun calculateAverage(score1: Score, score2: Score): Score {
    return (score1 + score2) / 2
}


fun printNumbers(numbers: Numbers) {
    println("Numbers: ${numbers.joinToString()}")
}


fun checkPass(score: Score): Boolean {
    return score >= 50
}

fun main() {

    displayStudent("Vibol", 20)

    val average = calculateAverage(80.0, 90.0)
    println("Average Score: $average")

    val nums = arrayOf(10, 20, 30, 40)
    printNumbers(nums)

    val result = checkPass(75.0)
    println("Pass Exam: $result")
}