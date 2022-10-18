package de.mahpgnaohhnim.mhunterdb.monster.dto

import java.time.LocalDateTime
import java.util.*

data class MonsterDto(
    var id: UUID?,
    var name: String,
    var created: LocalDateTime?,
    var updated: LocalDateTime?
)
