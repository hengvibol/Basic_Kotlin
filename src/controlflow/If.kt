package controlflow

fun main() {
    val isAbsent =  false
    val result: String = checkAbsent(isAbsent)
    println("Result: $result")

    val dayTypeCode = "02"
    val day = convertCodeToDay(dayTypeCode)
    println("Day: $day")

}

fun checkAbsent(value: Boolean):String {
    if (value) {
        println("Condition is Absent")
        return "Student is Absent"
    }
    return "Student is Absent"
}

fun convertCodeToDay(code:String):String {
    if(code == "01"){
        return "Monday"
    }else if(code == "02"){
        return "Tuesday"
    }else if(code == "03"){
        return "Wednesday"
    }else if(code == "04"){
        return "Thursday"
    }else if(code == "05"){
        return "Friday"
    }else if(code == "06"){
        return "Saturday"
    } else{
        return "Sunday"
    }
}