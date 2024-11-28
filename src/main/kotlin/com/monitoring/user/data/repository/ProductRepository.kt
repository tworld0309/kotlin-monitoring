package com.monitoring.user.data.repository

import com.monitoring.user.data.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<ProductEntity, Long>