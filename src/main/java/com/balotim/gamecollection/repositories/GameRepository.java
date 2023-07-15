package com.balotim.gamecollection.repositories;

import com.balotim.gamecollection.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<Game, UUID> { }
