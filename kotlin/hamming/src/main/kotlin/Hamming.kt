object Hamming {

    /**
     * #3 try:
     * Solution Using String.zip to create a Pair of char.
     */
    fun compute(dna1: String, dna2: String) = if (dna1.length == dna2.length)
        dna1.zip(dna2).count { (first,second)  -> first != second }
    else
        throw IllegalArgumentException("left and right strands must be of equal length.")

    /**
     * #2 try:
     * Solution Using String.filterIndexed to count the nucleotides
     */
    fun computeUsingOnlyOneIndex(dna1: String, dna2: String) = if (dna1.length == dna2.length)
        dna1.filterIndexed { index, ch -> dna2[index] != ch }.length
    else
        throw IllegalArgumentException("left and right strands must be of equal length.")

    /**
     * #1 try:
     * Solution Iterating over the two string simultaneous
     */
    fun computeIteratingOverAllValues(dna1: String, dna2: String) = if (dna1.length == dna2.length)
        (0 until dna1.length).count { index -> dna1[index] != dna2[index] }
    else
        throw IllegalArgumentException("left and right strands must be of equal length.")

}