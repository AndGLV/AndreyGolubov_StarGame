package ru.golubov.game;


import com.badlogic.gdx.Game;

import ru.golubov.game.screen.menu.MenuScreen;

public class Star2DGame extends Game{
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
