package ru.golubov.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.golubov.engine.math.Rect;
import ru.golubov.engine.sprite.Sprite;



public class Background extends Sprite {

    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
