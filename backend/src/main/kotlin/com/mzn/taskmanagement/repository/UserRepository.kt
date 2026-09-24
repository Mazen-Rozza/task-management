package com.mzn.taskmanagement.repository

import com.mzn.taskmanagement.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>
