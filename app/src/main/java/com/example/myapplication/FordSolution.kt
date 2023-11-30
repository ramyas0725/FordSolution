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
    }
}