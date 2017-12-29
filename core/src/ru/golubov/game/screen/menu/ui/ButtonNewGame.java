package ru.golubov.game.screen.menu.ui;


import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.golubov.engine.math.Rect;
import ru.golubov.engine.ui.ActionListener;
import ru.golubov.engine.ui.ScaledTouchUpButton;

public class ButtonNewGame extends ScaledTouchUpButton{

    public ButtonNewGame(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btPlay"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setLeft(worldBounds.getLeft());
    }
}
