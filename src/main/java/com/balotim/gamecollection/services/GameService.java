package com.balotim.gamecollection.services;

import com.balotim.gamecollection.entities.Game;
import com.balotim.gamecollection.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public Page<Game> findAllGames(Pageable pageable) {
        return gameRepository.findAll(pageable);
    }
}
