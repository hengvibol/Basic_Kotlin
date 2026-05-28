package controlflow

fun main(){
    val list: List<Char> = listOf('a', 'b', 'c', 'd', 'e')

//    for (item in list) {
//        println(item)
//    }
//
//    for ( index in list.indices){
//        println("Index is :$index")
//    }
//    for (i in 1.. list.size){
//        println("$i")
//    }

    for (i in 6 downTo 0 step 2){
        println("$i")
    }

}
