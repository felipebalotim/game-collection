package com.balotim.gamecollection.services;

import com.balotim.gamecollection.dtos.GameListDTO;
import com.balotim.gamecollection.entities.GameList;
import com.balotim.gamecollection.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameList = gameListRepository.findAll();
        return gameList.stream().map(GameListDTO::new).toList();
    }
}
