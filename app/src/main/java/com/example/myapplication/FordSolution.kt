package com.example.myapplication

class FordSolution {


    companion object {
        private val romanSymbols =
            arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        private val integers = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)

        fun intToRoman(num: Int): String {
            var remainder = num
            val output: StringBuilder = StringBuilder()

            for (i in integers.indices) {
                while (remainder >= integers[i]) {
                    remainder -= integers[i]
                    output.append(romanSymbols[i])
                }
            }
            return output.toString()
        }

        fun romanToInt(roman: String): Int {

            val romanToIntMap =
                mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
            var output = 0
            var previousVal = 0
//input XX
            for (char in roman.reversed()) {
                val currentVal = romanToIntMap[char.toString()]
                if (currentVal != null) {

                    if (currentVal < previousVal) {
                        output -= currentVal
                    } else {
                        output += currentVal
                    }
                    previousVal = currentVal
                }
            }
            return output
        }

    }
}