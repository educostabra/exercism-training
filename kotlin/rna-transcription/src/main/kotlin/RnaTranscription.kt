fun transcribeToRna(dna: String): String {
    var equivalence = mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')
    var rna = ""
    dna.forEach { rna = rna.plus(equivalence[it]) }
    return rna
}