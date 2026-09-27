package com.mzn.taskmanagement.dto

data class UserResponse(
    val id: Int,
    val name: String,
    val email: String,
    val role: String
)