fun main() {
    println (timeAgo (30))
    println (timeAgo (90))
    println (timeAgo (360))
    println (timeAgo (3600))
    println (timeAgo (7200))
    println (timeAgo (90000))
    println (timeAgo (900000))
    println (timeAgo (9000000))
}

fun timeAgo (
    seconds: Int): String{

    val numberOfDays: Int
    val numberOfHours: Int
    val numberOfMinutes: Int

    numberOfDays = seconds / 86400
    numberOfHours = (seconds % 86400 ) / 3600
    numberOfMinutes = ((seconds % 86400 ) % 3600 ) / 60

    val timeAgo = when {

        (numberOfDays == 1) -> "день назад"
        (numberOfDays in 2..30) -> "$numberOfDays д. назад"
        (numberOfDays > 30) -> "больше месяца назад"
        (numberOfHours == 1) -> "час назад"
        (numberOfHours in 2..24) -> "$numberOfHours ч. назад"
        (numberOfMinutes < 1) -> "меньше минуты назад"
        (numberOfMinutes == 1) -> "минуту назад"
        (numberOfMinutes in 2..59) -> "$numberOfMinutes мин. назад"

        else -> "Что-то пошло не так"
    }

    return "Публикация была сделана $timeAgo"
}