fun main() {

      println("при росте 168 см. и весе 120 кг. вердикт - "+ verdict (120.0, 1.68))
      println("при росте 186 см. и весе 90 кг. вердикт - "+ verdict (90.0, 1.86))
      println("при росте 186 см. и весе 80 кг. вердикт - "+ verdict (80.0, 1.86))
}

fun verdict (
    weight: Double,
    height: Double): String{
    val index = bodyMassIndex(weight, height)
    val verdict = when {
        (index < 16.0) -> "Выраженный дефицит массы тела"
        (index >= 16.0 && index < 18.5) -> "Недостаточная масса тела"
        (index >= 18.5 && index < 25) -> "Норма"
        (index >= 25.0 && index < 30) -> "Избыточная масса тела"
        (index >= 30.0 && index < 35) -> "Ожирение"
        (index >= 35 && index < 40) -> "Ожирение резкое"
        (index >= 40) -> "Очень резкое ожирение"
        else -> "Что-то пошло не так"
    }
return verdict
}

fun bodyMassIndex(
    weight: Double,
    height: Double): Double {
    return (weight / (height * height))
}

