package com.balotim.gamecollection.controllers;

import com.balotim.gamecollection.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<Object> findAllGames(
        @PageableDefault(page = 0, size = 10, sort = "score", direction = Sort.Direction.DESC)
        Pageable pageable
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(gameService.findAllGames(pageable));
    }
}
