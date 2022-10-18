package de.mahpgnaohhnim.mhunterdb.monster.repository

import de.mahpgnaohhnim.mhunterdb.monster.domain.Monster
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MonsterRepository : JpaRepository<Monster, UUID> {
}
