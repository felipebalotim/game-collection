package com.balotim.gamecollection.services;

import com.balotim.gamecollection.dtos.GameDTO;
import com.balotim.gamecollection.dtos.GameMinDTO;
import com.balotim.gamecollection.entities.Game;
import com.balotim.gamecollection.projections.GameMinProjection;
import com.balotim.gamecollection.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public Page<Game> findAllGames(Pageable pageable) {
        return gameRepository.findAll(pageable);
    }
    
    @Transactional(readOnly = true)
    public Game findById(Long id) {
    	return gameRepository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> gameMinProjections = gameRepository.searchByList(listId);
        return gameMinProjections.stream().map(GameMinDTO::new).toList();
    }
}
