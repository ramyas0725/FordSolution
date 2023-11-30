package com.example.myapplication

import com.example.myapplication.FordSolution.Companion.intToRoman
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FordSolutionTest {
    @Test
    fun testIntToRomanWhenNumIsLessThanTen(){
        assertEquals("II",intToRoman(2))
        assertEquals("VII",intToRoman(7))
        assertEquals("V",intToRoman(5))
        assertEquals("IX",intToRoman(9))
    }

    @Test
    fun testIntToRomanWhenNumIsLessThanFifty(){
        assertEquals("XXXV",intToRoman(35))
        assertEquals("XXVII",intToRoman(27))
        assertEquals("XLV",intToRoman(45))
        assertEquals("XIV",intToRoman(14))
    }

    @Test
    fun testIntToRomanWhenNumIsZero(){
        assertEquals("",intToRoman(0))
    }

    @Test
    fun testIntToRomanWhenNumIsNegative(){
        assertEquals("",intToRoman(-4))
    }

}