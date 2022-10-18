package de.mahpgnaohhnim.mhunterdb.monster.model

import de.mahpgnaohhnim.mhunterdb.monster.dto.MonsterDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import java.util.*


@Entity
data class Monster(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID = UUID.randomUUID(),
    var name: String
) {
    constructor() : this(UUID.randomUUID(), "")
    constructor(name: String) : this(UUID.randomUUID(), name)

    fun toDto(): MonsterDto {
        return MonsterDto(this.id, this.name)
    }
}
