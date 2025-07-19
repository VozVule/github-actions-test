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
    fun checkInstanceTest() {
        val result = sut.getRandomNumberBasedOnTime()
        Assert.isInstanceOf(Number::class.java, result)
    }

    @Test
    fun failTest() {
        val result = true
        Assert.isTrue(!result, "Neeeein")
    }
}