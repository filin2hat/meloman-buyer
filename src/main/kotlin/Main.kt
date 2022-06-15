fun main() {
    val purchaseAmount = 1000
    val buyer = true
    var discount: Double

    if (purchaseAmount > 1000 && purchaseAmount < 10_000) {
        discount = 100.00
    } else if (purchaseAmount >= 10_001) {
        discount = (purchaseAmount / 100 * 5).toDouble()
    } else
        discount = 0.0

    if (buyer) {
        println(
            """Покупка - $purchaseAmount рублей ->
            |после применения 5% скидки - ${purchaseAmount.minus(discount)} рублей.
            |после применения 1% скидки - ${(purchaseAmount.minus(discount)) - purchaseAmount.minus(discount) / 100 * 1} рублей.
        """.trimMargin()
        )
    } else {
        println(
            """Покупка - $purchaseAmount рублей ->
            |после применения 5% скидки - ${purchaseAmount.minus(discount)} рублей.
        """.trimMargin()
        )
    }
}