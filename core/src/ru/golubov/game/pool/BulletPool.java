package ru.golubov.game.pool;


import ru.golubov.engine.pool.SpritesPool;
import ru.golubov.game.bullet.Bullet;

public class BulletPool extends SpritesPool<Bullet>{

    @Override
    protected Bullet newObject() {
        return new Bullet();
    }

    @Override
    protected void debugLog() {
        System.out.println("Bullet pool change active/free : " + activeObjects.size() + " / " + freeObjects.size());
    }
}
