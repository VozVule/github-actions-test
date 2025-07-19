package com.example.workflow.githubactions.arithmetic.service

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.Assert

@SpringBootTest
class ArithmeticServiceTest {

    val sut = ArithmeticService()

    @Test
    fun testRandom() {
        val result = sut.getRandomNumberBasedOnTime()
        Assert.isTrue(result != 0, "Good job")
    }

    @Test
    fun failTest() {
        val result = sut.getRandomNumberBasedOnTime()
        Assert.isNull(result, "Nein")
    }
}