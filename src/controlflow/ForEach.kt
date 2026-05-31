package controlflow



fun main(){

    determineGrade()
}

data class StudentInfo(
    val studentId: String,
    val studentName: String,
    val studentScore: Int
)

fun determineGrade(){
    val arr = arrayOf<StudentInfo>(
        StudentInfo("001","Vibol 0",20),
        StudentInfo("002","Vibol 1",67),
        StudentInfo("003","Vibol 2",89),
        StudentInfo("004","Vibol 3",90),
        StudentInfo("005","Vibol 4",100),
    )
    arr.forEach { student ->
        if (student.studentScore >= 50){
            println("Student ID : ${student.studentId} Name ${student.studentName} is passed")
        }else{
            println("Student ID : ${student.studentId} Name ${student.studentName} is failed")
        }
    }
}