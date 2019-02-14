package com.brentaureli.mariobros;


import com.badlogic.gdx.Game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brentaureli.mariobros.Screens.PlayScreen;

public class MarioBros extends Game {
    public SpriteBatch batch;
    Texture img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new PlayScreen(this));
    }


    @Override
    public void render() {
        // delegates render method to play screen or whatever screen is active at the time
        super.render();
    }
}
