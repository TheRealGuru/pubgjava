package com.github.mautini.pubgjava.model.player;

import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.Entity;

public class Player extends Entity {

    @SerializedName("attributes")
    private PlayerAttributes playerAttributes;

    @SerializedName("relationships")
    private PlayerRelationships playerRelationships;

    private Links links;

    public Player() {
        super();
    }

    public PlayerAttributes getPlayerAttributes() {
        return playerAttributes;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    public PlayerRelationships getPlayerRelationships() {
        return playerRelationships;
    }

    public void setPlayerRelationships(PlayerRelationships playerRelationships) {
        this.playerRelationships = playerRelationships;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
