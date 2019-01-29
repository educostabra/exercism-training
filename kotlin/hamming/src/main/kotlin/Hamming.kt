object Hamming {

    fun compute(dna1: String, dna2: String) = if (dna1.length == dna2.length)
        (0 until dna1.length).count { i -> dna1[i] != dna2[i] }
    else
        throw IllegalArgumentException("left and right strands must be of equal length.")

}