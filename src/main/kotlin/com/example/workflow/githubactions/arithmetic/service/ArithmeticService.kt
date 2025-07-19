package com.example.workflow.githubactions.arithmetic.service

import org.springframework.stereotype.Service
import java.time.LocalTime
import java.util.Random

@Service
class ArithmeticService {
    fun getRandomNumberBasedOnTime() : Number {
        val now = LocalTime.now()
        // generate a random number
        val seed = (now.hour + now.nano + now.minute + now.second + now.nano * now.nano).toLong()
        return Random(seed).nextInt() % 10_000
    }
}