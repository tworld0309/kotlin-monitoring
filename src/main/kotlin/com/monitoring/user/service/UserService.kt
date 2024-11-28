package com.monitoring.user.service

import com.monitoring.user.data.dto.UserResDto
import com.monitoring.user.data.entity.ProductEntity
import com.monitoring.user.data.entity.UserEntity
import com.monitoring.user.data.repository.ProductRepository
import com.monitoring.user.data.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository,
    val productRepository: ProductRepository
) {

    private val log = LoggerFactory.getLogger(UserService::class.java)

    fun getAllUsers(): List<UserResDto> {
        val userEntities: List<UserEntity> = userRepository.findAll()
        return userEntities.map { UserResDto.fromEntity(it) }
    }

    fun getUser(id : Long): UserResDto {
        log.debug("Retrieving user by id: $id")
        val result: UserEntity = userRepository.findById(id).orElseThrow {
            IllegalArgumentException("User not found for id: $id")
        }
        return UserResDto.fromEntity(result)
    }

    fun getAllProducts(): List<ProductEntity> {
        return productRepository.findAll()
    }
}