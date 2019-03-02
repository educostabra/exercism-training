object Luhn {

    fun isValid(numberString: String): Boolean {

        if (numberString.contains(Regex("\\p{Punct}")) || numberString.contains(Regex("\\p{Alpha}")))
            return false

        var numbers = numberString
            .filter { digit -> digit.isDigit() }
            .map { digit -> digit.toNumber() }
            .toIntArray()

        if (numbers.isEmpty() || numbers.size == 1)
            return false

        for (index in numbers.size - 2 downTo 0 step 2) {
            numbers[index] = double(numbers[index])
        }

        return numbers.reduce { sum, value -> sum + value } % 10 == 0

    }

    /** Extension Function */
    private fun Char.toNumber() = Character.getNumericValue(this)


    private fun double(number: Int): Int {
        var value = number * 2
        return if (value > 9) value - 9 else value
    }
}