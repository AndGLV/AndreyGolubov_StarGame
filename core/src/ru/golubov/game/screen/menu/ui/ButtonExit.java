package ru.golubov.game.screen.menu.ui;


import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.golubov.engine.math.Rect;
import ru.golubov.engine.ui.ActionListener;
import ru.golubov.engine.ui.ScaledTouchUpButton;

public class ButtonExit extends ScaledTouchUpButton{

    public ButtonExit(TextureAtlas atlas, ActionListener actionListener, float pressScale) {
        super(atlas.findRegion("btExit"), actionListener, pressScale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setBottom(worldBounds.getBottom());
        setRight(worldBounds.getRight());
    }
}
