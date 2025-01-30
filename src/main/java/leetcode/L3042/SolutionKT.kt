package leetcode.L3042

fun countPrefixSuffixPairs(words: Array<String>): Int {
    val n = words.size

    var count = 0

    for (i in 0 until n) {

        for (j in i until n ) {
            if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                count ++
            }
        }
    }

    return count
}

fun main() {
    val words = arrayOf("a", "aba", "ababa", "aa")
    println(countPrefixSuffixPairs(words))
}