package leetcode.L2185

fun main() {
    val words = arrayOf("pay", "attention", "practice", "attend")
    val pref = "at"
    println(prefixCount(words, pref))
}

fun prefixCount(words: Array<String>, pref: String): Int {
    var count = 0

    for (word in words) {
        if (word.startsWith(pref)) {
            count ++
        }
    }
    return count
}