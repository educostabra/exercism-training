/**
 * 3 different solution
 */
object Isogram {

    /**
     * The solution using Hashset
     * 1. Transform the string to lowercase due the case insensitive checking
     * 2. Replace characters that can be repeated
     * 3. create a HashSet where the elements are characters without be repeated
     * 4. Compare the size of the HashSe with the word´s length.
     * If the values are equals there is no repetition and the word is a Isogram
     */
    fun isIsogram2(word: String): Boolean {
        var wordCleaned = word.toLowerCase()
                .replace(oldValue = " ", newValue = "")
                .replace(oldValue = "-", newValue = "")
        return wordCleaned.toHashSet().size == wordCleaned.length
    }

    /**
     * The solution using toCharArray and distinct.
     * The same principle of the solution using the HashSet
     */
    fun isIsogram(word: String): Boolean {
        var wordCleaned = word.toLowerCase()
                .replace(oldValue = " ", newValue = "")
                .replace(oldValue = "-", newValue = "")
        return wordCleaned.toCharArray().distinct().size == wordCleaned.length
    }
    /**
     * The solution using list and group by:
     * 1. Transform the string to lowercase due the case insensitive checking
     * 2. Replace characters that can be repeated
     * 3. Create a list of characters from the string
     * 4. Group the list by character where the output will be a Map where the key is the character and the value a List of the same character
     * 5. Count all the values into the map (the List) which have more than one element.
     * If the no values with size higher than one there is no repetition and teh word is a Isogram.
     */
    fun isIsogram1(word: String) =
            word.toLowerCase()
                    .replace(oldValue = " ", newValue = "")
                    .replace(oldValue = "-", newValue = "")
                    .toList().groupBy { it }
                    .count { it.value.size > 1 } == 0

}


