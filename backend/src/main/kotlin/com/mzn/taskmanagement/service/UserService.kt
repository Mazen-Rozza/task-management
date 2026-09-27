package com.mzn.taskmanagement.service

import com.mzn.taskmanagement.dto.UserResponse
import com.mzn.taskmanagement.exception.UserNotFoundException
import com.mzn.taskmanagement.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getUserById(id: Int): UserResponse {
        val user = userRepository.findById(id)
            .orElseThrow { UserNotFoundException(id) }

        return UserResponse(
            id = requireNotNull(user.id) {"Persisted user must have an id"},
            name = user.name,
            email = user.email,
            role = user.role.name
        )
    }
}