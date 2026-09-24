package com.mzn.taskmanagement.repository

import com.mzn.taskmanagement.model.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Int>