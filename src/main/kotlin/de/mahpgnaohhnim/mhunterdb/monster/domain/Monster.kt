package de.mahpgnaohhnim.mhunterdb.monster.domain

import de.mahpgnaohhnim.mhunterdb.common.domain.BaseEntity
import de.mahpgnaohhnim.mhunterdb.monster.dto.MonsterDto
import jakarta.persistence.Column
import jakarta.persistence.Entity


@Entity
data class Monster(
    @Column(unique = true)
    var name: String,
    var description: String?
) : BaseEntity() {
    constructor() : this("", null)
    constructor(name: String) : this(name, null)

    fun toDto(): MonsterDto {
        return MonsterDto(this.id, this.name, this.created, this.updated)
    }
}
