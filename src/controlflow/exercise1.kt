package controlflow

fun main() {

    val dayTypeCode = "02"
    val day = convertCodeToDayExample(dayTypeCode)
    println("Day: $day")
}

fun convertCodeToDayExample(dayTypeCode: String): String {
    return if (dayTypeCode == "01") {
        "Monday"
    }else if (dayTypeCode == "02"){
        "Tuesday"
    }
    else if (dayTypeCode == "03"){
        "Wednesday"
    }else if (dayTypeCode == "04"){
        "Thursday"
    }else if(dayTypeCode == "05"){
        "Friday"
    }else if (dayTypeCode == "06"){
        "Saturday"
    }else if (dayTypeCode == "07"){
        "Sunday"
    }else{
        "Invalid day type"
    }
}