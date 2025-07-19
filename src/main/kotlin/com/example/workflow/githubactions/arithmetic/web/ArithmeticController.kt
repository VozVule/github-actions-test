package com.example.workflow.githubactions.arithmetic.web

import com.example.workflow.githubactions.arithmetic.service.ArithmeticService
import org.springframework.http.HttpEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/v1/arithmetic")
class ArithmeticController(
    private val arithmeticService: ArithmeticService
) {
    @GetMapping("/random")
    fun getRandomNumber(): HttpEntity<String> {
        val result = arithmeticService.getRandomNumberBasedOnTime()
        return HttpEntity(
            result.toString()
        )
    }
}