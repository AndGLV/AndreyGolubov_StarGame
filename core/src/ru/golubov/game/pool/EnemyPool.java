package ru.golubov.game.pool;


import ru.golubov.engine.math.Rect;
import ru.golubov.engine.pool.SpritesPool;
import ru.golubov.game.ship.Enemy;
import ru.golubov.game.ship.MainShip;

public class EnemyPool extends SpritesPool<Enemy> {
    private final BulletPool bulletPool;
    private final ExplosionPool explosionPool;
    private final Rect worldBounds;
    private final MainShip mainShip;

    public EnemyPool(BulletPool bulletPool, ExplosionPool explosionPool, Rect worldBounds, MainShip mainShip) {
        this.bulletPool = bulletPool;
        this.explosionPool = explosionPool;
        this.worldBounds = worldBounds;
        this.mainShip = mainShip;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, explosionPool, worldBounds, mainShip);
    }

    @Override
    protected void debugLog() {
        System.out.println("EnemyPool change active/free : " + activeObjects.size() + " / " + freeObjects.size());
    }
}
