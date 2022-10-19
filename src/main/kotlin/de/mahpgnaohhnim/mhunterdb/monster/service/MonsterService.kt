package de.mahpgnaohhnim.mhunterdb.monster.service

import de.mahpgnaohhnim.mhunterdb.monster.domain.Monster
import de.mahpgnaohhnim.mhunterdb.monster.dto.MonsterDto
import de.mahpgnaohhnim.mhunterdb.monster.repository.MonsterRepository
import org.springframework.stereotype.Service

@Service
class MonsterService(
    private val monsterRepository: MonsterRepository
) {

    fun fetchAll(): List<MonsterDto> {
        val allMonsters = this.monsterRepository.findAll()
        return allMonsters.map(Monster::toDto)
    }

    fun createMonster(monsterDto: MonsterDto): MonsterDto {
        val monster = Monster(monsterDto.name,monsterDto.description, monsterDto.elementalDamage,monsterDto.statusEffect,monsterDto.weakness)
        val saved = this.monsterRepository.saveAndFlush(monster)
        return saved.toDto()
    }
}
