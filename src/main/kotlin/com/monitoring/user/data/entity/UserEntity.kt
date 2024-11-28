package com.monitoring.user.data.entity

import jakarta.persistence.*

@Entity
@Table(name="users")
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false)
    val name: String? = null

    @Column(nullable = false)
    val email: String? = null // Getters and Setters
}