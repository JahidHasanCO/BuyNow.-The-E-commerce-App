package com.example.buynow.utils

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CardTypeTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `check master card`() {
        val result = CardType.detect("5301073311600441")
        assertEquals(result, CardType.MASTERCARD)
    }


    @Test
    fun `check visa card`() {
        val result = CardType.detect("4929107770069824")
        assertEquals(result, CardType.VISA)
    }

    @Test
    fun `check amex card`() {
        val result = CardType.detect("376373102145312")
        assertEquals(result, CardType.AMERICAN_EXPRESS)
    }


    @Test
    fun `check union pay card`() {
        val result = CardType.detect("6222022536058368")
        assertEquals(result, CardType.CHINA_UNION_PAY)
    }

    @Test
    fun `check diners club card`() {
        val result = CardType.detect("3010805991551163")
        assertEquals(result, CardType.DINERS_CLUB)
    }


    @Test
    fun `check discover card`() {
        val result = CardType.detect("6011278689154074")
        assertEquals(result, CardType.DISCOVER)
    }

    @Test
    fun `check jcb card`() {
        val result = CardType.detect("3566002020360505")
        assertEquals(result, CardType.JCB)
    }

    @Test
    fun `check empty card`() {
        val result = CardType.detect("")
        assertEquals(result, CardType.UNKNOWN)
    }

    @Test
    fun `check random card`() {
        val result = CardType.detect("3203600205660505")
        assertEquals(result, CardType.UNKNOWN)
    }

}