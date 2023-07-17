package com.balotim.gamecollection.repositories;

import com.balotim.gamecollection.entities.Game;
import com.balotim.gamecollection.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query(nativeQuery = true, value = """
        SELECT game.id, game.title, game.release_year, game.img_url, game.short_description, belonging.position
        FROM game
        INNER JOIN belonging ON game.id = belonging.game_id
        WHERE belonging.list_id = :listId
        ORDER BY belonging.position
    """)
    List<GameMinProjection> searchByList(Long listId);
}
