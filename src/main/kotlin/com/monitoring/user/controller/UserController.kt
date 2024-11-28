package com.monitoring.test.controller

import com.monitoring.user.data.dto.UserResDto
import com.monitoring.user.data.entity.ProductEntity
import com.monitoring.user.data.entity.UserEntity
import com.monitoring.user.service.UserService
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@OpenAPIDefinition(
    info = Info(
        title = "My User API",
        version = "1.0",
        description = "TEST APi"
    )
)
class UserController(val userService: UserService) {
    private val log = LoggerFactory.getLogger(UserController::class.java)

    @GetMapping("/users")
    fun getAllUsers(): List<UserResDto> {
        log.info("log-info - getAllUsers call ")
        return userService.getAllUsers()
    }

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: Long): UserResDto {
        log.info("log-info - getUser call ")
        return userService.getUser(id)
    }

    @GetMapping("/products")
    fun getAllProducts(): List<ProductEntity> {
        log.info("log-info - getAllProducts call ")

        return userService.getAllProducts()
    }

}