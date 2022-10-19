package de.mahpgnaohhnim.mhunterdb.monster.domain

import de.mahpgnaohhnim.mhunterdb.common.domain.BaseEntity
import de.mahpgnaohhnim.mhunterdb.common.enums.Elementals
import de.mahpgnaohhnim.mhunterdb.common.enums.StatusEffects
import de.mahpgnaohhnim.mhunterdb.monster.dto.MonsterDto
import jakarta.persistence.Column
import jakarta.persistence.Entity


@Entity
data class Monster(
    @Column(unique = true)
    var name: String,
    var description: String?,
    var elementalDamage: Elementals?,
    var statusEffect: StatusEffects?,
    var weakness: Elementals?
) : BaseEntity() {
    constructor() : this("", null, null, null, null)

    fun toDto(): MonsterDto {
        return MonsterDto(
            this.id,
            this.created,
            this.updated,
            this.name,
            this.description,
            this.elementalDamage,
            this.statusEffect,
            this.weakness
        )
    }
}
