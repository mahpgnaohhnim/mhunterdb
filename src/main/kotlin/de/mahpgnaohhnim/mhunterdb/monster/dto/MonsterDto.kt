package de.mahpgnaohhnim.mhunterdb.monster.dto

import de.mahpgnaohhnim.mhunterdb.common.enums.Elementals
import de.mahpgnaohhnim.mhunterdb.common.enums.StatusEffects
import java.time.LocalDateTime
import java.util.*

data class MonsterDto(
    var id: UUID?,
    var created: LocalDateTime? = null,
    var updated: LocalDateTime?,
    var name: String,
    var description: String?,
    var elementalDamage: Elementals? = null ,
    var statusEffect: StatusEffects? = null,
    var weakness: Elementals? = null
)
