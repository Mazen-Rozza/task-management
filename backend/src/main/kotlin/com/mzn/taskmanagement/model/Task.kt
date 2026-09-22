package com.mzn.taskmanagement.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = "tasks")
class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = true)
    val description: String?,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val status: Status,

    @Column(name = "created_at", nullable = false)
    val createdAt: OffsetDateTime,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: User
)