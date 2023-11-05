package lesson01_task05

fun main(){

    val secondInSpace = 6480
    val secondsInHours = 3600
    val unitOfTime = 60

    val hours = secondInSpace / secondsInHours
    val minutes = (secondInSpace % secondsInHours) / unitOfTime
    val seconds = ((secondInSpace % secondsInHours) % unitOfTime) / unitOfTime

    println("Время, которое Гагарин провел в космосе: 0$hours:$minutes:0$seconds")
}