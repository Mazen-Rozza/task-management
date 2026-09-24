package com.mzn.taskmanagement.repository

import com.mzn.taskmanagement.model.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Int>