
fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores
    testScores.toList()
        .sortedBy { pair ->  pair.second}
        .map { pair -> pair.first }
        .take(3)
        .forEach { println(it) }
}