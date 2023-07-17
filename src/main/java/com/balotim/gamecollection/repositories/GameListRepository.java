package com.balotim.gamecollection.repositories;

import com.balotim.gamecollection.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> { }
