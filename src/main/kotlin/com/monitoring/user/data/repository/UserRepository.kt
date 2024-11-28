package com.monitoring.user.data.repository

import com.monitoring.user.data.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>