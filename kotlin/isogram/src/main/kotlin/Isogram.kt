object Isogram {
    /**
     * The solution:
     * 1. Transform the string to lowercase due the case insensitive checking
     * 2. Replace characters that can be repeated
     * 3. Create a list of characters from the string
     * 4. Group the list by character where the output will be a Map where the key is the character and the value a List of the same character
     * 5. Count all the values into the map (the List) which have more than one element.
     * Where there is no values with site higher than 1 the word is a Isogram.
     */
    fun isIsogram(word: String) =
            word.toLowerCase()
                    .replace(oldValue = " ", newValue = "")
                    .replace(oldValue = "-", newValue = "")
                    .toList().groupBy { it }
                    .count { it.value.size > 1 } == 0

}


