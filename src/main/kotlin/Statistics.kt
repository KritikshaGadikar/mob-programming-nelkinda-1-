

fun stat(option: String,list: List<Int>): Double {
    return when(option) {
        "min" -> list.min().toDouble()
        "max" -> list.max().toDouble()
        else -> Double.NaN
    }
}
