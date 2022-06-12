fun main() {
    val amount: Int = 3600
    val comissionPercent: Float = 0.75F
    val comissionFix: Int = 3500
    if((amount / 100 * comissionPercent) > comissionFix)
    {
        println("Сумма перевода: " + (amount - (amount / 100 * comissionPercent)))
        println("Комиссия: " + (amount / 100 * comissionFix))
    } else {
        println("Сумма перевода: " + (amount - comissionFix))
        println("Комиссия: " + comissionFix)
    }
    }
