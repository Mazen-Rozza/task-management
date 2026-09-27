package com.mzn.taskmanagement.controller

import com.mzn.taskmanagement.dto.UserResponse
import com.mzn.taskmanagement.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userService: UserService
) {
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Int): UserResponse {
        return userService.getUserById(id)
    }
}