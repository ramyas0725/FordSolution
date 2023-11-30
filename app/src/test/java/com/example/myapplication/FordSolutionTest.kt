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
    fun testIntToRomanWhenNumIsPositive(){
        assertEquals("II",intToRoman(2))
    }
}