object Luhn {

    fun isValid(numbersString: String): Boolean = numbersString
        .let { if (it.hasLettersOrPonctuation()) return false else it }
        .filter { it.isDigit() }
        .map { it.toNumber() }
        .let { if (it.isEmpty() || it.size == 1) return false else it }
        .reversed()
        .mapIndexed { index, digit -> if (index.isEven()) digit else compute(digit) }
        .sum()
        .rem(10) == 0

    /** Extension Function */
    private fun Char.toNumber() = Character.getNumericValue(this)

    private fun Int.isEven() = this % 2 == 0

    private fun String.hasLettersOrPonctuation() = this.contains(Regex("\\p{Punct}|\\p{Alpha}"))

    private fun compute(number: Int): Int {
        var doubledValue = number * 2
        return if (doubledValue > 9) doubledValue - 9 else doubledValue
    }
}