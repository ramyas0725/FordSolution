package com.example.myapplication

import com.example.myapplication.FordSolution.Companion.intToRoman
import com.example.myapplication.FordSolution.Companion.romanToInt
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class FordSolutionTest {
    //Test Cases For IntToRoman
    @Test
    fun testIntToRomanWhenNumIsLessThanTen() {
        assertEquals("II", intToRoman(2))
        assertEquals("VII", intToRoman(7))
        assertEquals("V", intToRoman(5))
        assertEquals("IX", intToRoman(9))
    }

    @Test
    fun testIntToRomanWhenNumIsLessThanFifty() {
        assertEquals("XXXV", intToRoman(35))
        assertEquals("XXVII", intToRoman(27))
        assertEquals("XLV", intToRoman(45))
        assertEquals("XIV", intToRoman(14))
    }

    @Test
    fun testIntToRomanWhenNumIsZero() {
        assertEquals("", intToRoman(0))
    }

    @Test
    fun testIntToRomanWhenNumIsNegative() {
        assertEquals("", intToRoman(-4))
    }

    @Test
    fun testIntToRomanWhenNumIsLessThan1000() {
        assertEquals("CCCLVI", intToRoman(356))
        assertEquals("DCLXX", intToRoman(670))
        assertEquals("DCCCLXXI", intToRoman(871))
        assertEquals("D", intToRoman(500))
        assertEquals("CXXII", intToRoman(122))
        assertEquals("CMXCIX", intToRoman(999))
        assertEquals("CDLI", intToRoman(451))

    }

    @Test
    fun testIntToRomanWhenNumIsGreaterThan1000() {
        assertEquals("MM", intToRoman(2000))
        assertEquals("MD", intToRoman(1500))
        assertEquals("MMMD", intToRoman(3500))
        assertEquals("MMMMM", intToRoman(5000))
        assertEquals("MMCCCXLV", intToRoman(2345))
        assertEquals("MMMMMDXCIII", intToRoman(5593))
        assertEquals("MCCXXII", intToRoman(1222))

    }

    //Test Cases End For IntToRoman

    //Test Cases For RomanToInt

    @Test
    fun testRomantoIntWhenNumIsLessThanTen() {
        assertEquals(2, romanToInt("II"))
        assertEquals(7, romanToInt("VII"))
        assertEquals(5, romanToInt("V"))
        assertEquals(9, romanToInt("IX"))
    }

    @Test
    fun testRomanToIntWhenNumIsLessThanFifty() {
        assertEquals(35, romanToInt("XXXV"))
        assertEquals(27, romanToInt("XXVII"))
        assertEquals(45, romanToInt("XLV"))
        assertEquals(14, romanToInt("XIV"))
    }

    @Test
    fun testRomanToIntWhenNumIsZero() {
        assertEquals(0, romanToInt(""))
    }

    @Test
    fun testRomanToIntWhenNumIsLessThan1000() {
        assertEquals(356, romanToInt("CCCLVI"))
        assertEquals(670, romanToInt("DCLXX"))
        assertEquals(871, romanToInt("DCCCLXXI"))
        assertEquals(500, romanToInt("D"))
        assertEquals(122, romanToInt("CXXII"))
        assertEquals(999, romanToInt("CMXCIX"))
        assertEquals(451, romanToInt("CDLI"))

    }

    @Test
    fun testRomanToIntWhenNumIsGreaterThan1000() {
        assertEquals(2000, romanToInt("MM"))
        assertEquals(1500, romanToInt("MD"))
        assertEquals(3500, romanToInt("MMMD"))
        assertEquals(5000, romanToInt("MMMMM"))
        assertEquals(2345, romanToInt("MMCCCXLV"))
        assertEquals(5593, romanToInt("MMMMMDXCIII"))
        assertEquals(1222, romanToInt("MCCXXII"))

    }
    //Test Cases End For RomanToInt

}