package com.example.test


import junit.framework.Assert
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
     var math:Math?=null

    @Before
    fun setup(){
        math = Math()
    }
    @Test
    fun simpleAdd(){
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun symbolAdd(){
       assertEquals("нельзя вводить буквы", math?.add(".№%?&", "2"))
    }

    @Test
    fun doubleAdd(){
        assertEquals("4.4", math?.add("2.4", "2.0"))
    }

    @Test
    fun  simpleDivide(){
        assertEquals("2", math?.divide("4", "2"))
    }

    @Test
    fun minusAdd(){
        assertEquals("2", math?.add("-2", "4"))
    }

    @Test
    fun  zeroDivide(){
        assertEquals("нельзя делить на ноль", math?.divide("5", "0"))
    }

    @After
    fun detach(){
        math = null
    }

}