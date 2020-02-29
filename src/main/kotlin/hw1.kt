fun main() {
    println( "При стоимости текущей продажи 200 и сумме предыдущих продаж 11000 взымаемый % составит: "+
            calculateFee(200, 11_000, true)
            +" (у эксклюзивного автора)")

    println( "При стоимости текущей продажи 500 и сумме предыдущих продаж 1000 взымаемый % составит: "
            +calculateFee(500, 1000)
            +" (у обычного автора)")
}

fun calculateFee(
    amount: Int,
    total: Int,
    exclusive: Boolean = false
): Int {

    var fee: Double

    if (total < 1001) fee = 0.3
    else if (total < 10001) fee = 0.25
    else if (total < 50001) fee = 0.2
    else fee = 0.15

    if (exclusive) fee -= 0.05

    return (amount * fee).toInt()
}



