package com.monitoring.user.data.dto

import com.monitoring.user.data.entity.UserEntity

data class UserResDto(
    val id: Long?,
    val name: String?,
    val email: String?
) {
    companion object {
        fun fromEntity(entity: UserEntity): UserResDto {
            return UserResDto(
                id = entity.id,
                name = entity.name,
                email = entity.email
            )
        }
    }
}