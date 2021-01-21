package org.when.example.switchable;

import java.util.Arrays;

/**
 * @author: when
 * @create: 2021-01-21  21:51
 **/
public class BuildingManagement {
    private Asset[] assets = new Asset[24];
    private int itemNums = 0;

    public void addAsset(Asset asset) {
        assets[itemNums++] = asset;
    }

    public void goodMorning() {
        Arrays.stream(assets)
                .filter(asset -> asset instanceof Switchable)
                .forEach(this::powerUp);
    }

    private void powerUp(Asset asset) {
        ((Switchable) asset).powerUp();
    }

    public void goodNight() {
        Arrays.stream(assets)
                .filter(asset -> asset instanceof Switchable)
                .forEach(this::powerDown);
    }

    private void powerDown(Asset asset) {
        ((Switchable) asset).powerDown();
    }
}
