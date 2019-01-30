/**
 * Solution using map
 *
 * map return a list containing the result of the given
 * function to each character and at end join all the
 * values using joinToString.
 */
fun transcribeToRna(dna: String) =
        dna.map { mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')[it] }
                .joinToString("")

/**
 * Solution using fold(...)
 *
 * fold takes an initial value, and the first invocation of the
 * lambda you pass to it will receive that initial value and the
 * first element of the collection as parameters.
 */
fun transcribeToRna1(dna: String) =
        dna.fold("") { complement, nucleotide ->
            complement.plus(
                    mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')[nucleotide]
            )
        }

/**
 * Solution using string concatenation
 */
fun transcribeToRna2(dna: String): String {
    var nucleotides = mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')
    var complement = ""
    dna.forEach { complement = complement.plus(nucleotides[it]) }
    return complement
}

