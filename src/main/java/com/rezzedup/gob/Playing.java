package com.rezzedup.gob;

import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.impl.GameImpl;

public enum Playing
{
    COLON_GOB_HELP("helping you"),
    GOBLIN_HELP(Emoji.JAPANESE_GOBLIN + "HI!!"),
    GOBLIN_ROBOT_HELLO(Emoji.JAPANESE_GOBLIN + " " + Emoji.ROBOT + "with Nathan100"),
    GOBLIN_EQUALS_MATH(Emoji.JAPANESE_GOBLIN + "1 + 1 = 11");
    
    private final String status;
    
    Playing(String status)
    {
        this.status = status;
    }
    
    public String getStatus()
    {
        return this.status;
    }
    
    public Game getGame()
    {
        return new GameImpl(status, "", Game.GameType.DEFAULT);
    }
    
    public Playing next()
    {
        int next = (ordinal() < values().length - 1) ? ordinal() + 1 : 0;
        return values()[next];
    }
}
