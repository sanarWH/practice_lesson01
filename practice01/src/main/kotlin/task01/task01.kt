package task01

//Определение времени стуок
fun main(){
    println("Оперделение времени суток для самых маленьких.")
    println(" ")
    println("Введите текущий час. Минуты указывать не нужно: ")

    val time = readLine()!!.toInt()

    if((time >= 6) && (time < 12)) println("Сейчас утро.")
    else if((time >= 12) && (time <18)) println("Сейчас день")
    else if((time >= 18) && (time < 24)) println("Сейчас вечер")
    else if((time >=0) && (time <6)) println("Сейчас ночь")
    else println("Число введено некорректно")

}
const val MORNING = 6
const val DAY = 12
const val EVENING = 18
const val NIGHT = 0

//fun main(){
//    println("Оперделение времени суток для самых маленьких.")
//    println(" ")
//    println("Введите текущий час. Минуты указывать не нужно: ")
//
//    val time = readLine()!!.toInt()
//
//    if((time < 0) && (time >24)){
//        println("Число введено некорректно")
//    } else if((time >= 6) && (time < 12)){
//        println("Сейчас утро.")
//    } else if((time >= 12) && (time <18)){
//        println("Сейчас день")
//    } else if((time >= 18) && (time < 24)){
//        println("Сейчас вечер")
//    } else if((time >=0) && (time <6)){
//        println("Сейчас ночь")
//    }
//}
//const val MORNING = 6
//const val DAY = 12
//const val EVENING = 18
//const val NIGHT = 0