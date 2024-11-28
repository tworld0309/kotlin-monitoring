package com.monitoring.user.data.entity

import jakarta.persistence.*


@Entity
@Table(name="products")
class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false)
    private val name: String? = null

    @Column(nullable = false)
    private val price: Double? = null // Getters and Setters
}