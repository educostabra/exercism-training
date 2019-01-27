object Pangram {

    fun isPangram(phrase: String): Boolean {
        "abcdefghijklmnopqrstuvwxyb".forEach { letter ->
            if (phrase.contains(char = letter, ignoreCase = true).not()) return false
        }
        return true
    }

    fun isPangram2(str: String) = ('a'..'z').all { str.contains(it, ignoreCase = true) }


    fun isPangram3(s: String) = ('a'..'z').all { it in s.toLowerCase() }


    fun isPangram4(input: String): Boolean {
        return ('a'..'z').map { input.toLowerCase().contains(it) }.reduce(Boolean::and)
    }
}
