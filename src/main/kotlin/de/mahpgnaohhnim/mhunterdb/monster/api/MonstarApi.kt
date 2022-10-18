package de.mahpgnaohhnim.mhunterdb.monster.api

import de.mahpgnaohhnim.mhunterdb.monster.dto.MonsterDto
import de.mahpgnaohhnim.mhunterdb.monster.service.MonsterService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/monster")
class MonstarApi(private val monsterService: MonsterService) {

    @GetMapping("/all")
    fun getAllMonsters(): ResponseEntity<List<MonsterDto>> {
        val result = this.monsterService.fetchAll()
        return ResponseEntity(result, HttpStatus.OK)
    }

    @GetMapping("/create/{name}")
    fun createMonster(@PathVariable name: String): ResponseEntity<MonsterDto> {
        val result = this.monsterService.createMonster(MonsterDto(null,name))
        return ResponseEntity(result, HttpStatus.OK)
    }

    @PostMapping("/create")
    fun createMonster(@RequestBody monsterDto: MonsterDto): ResponseEntity<MonsterDto> {
        val result = this.monsterService.createMonster(monsterDto)
        return ResponseEntity(result, HttpStatus.OK)
    }

}
