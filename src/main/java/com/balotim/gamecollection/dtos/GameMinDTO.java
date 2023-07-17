package com.balotim.gamecollection.dtos;

import com.balotim.gamecollection.entities.Game;
import com.balotim.gamecollection.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer releaseYear;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        releaseYear = game.getReleaseYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        id = gameMinProjection.getId();
        title = gameMinProjection.getTitle();
        releaseYear = gameMinProjection.getReleaseYear();
        imgUrl = gameMinProjection.getImgUrl();
        shortDescription = gameMinProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
