object Pangram {

    fun isPangram(phrase: String) = ('a'..'z').all { phrase.contains(it, ignoreCase = true) }

}
