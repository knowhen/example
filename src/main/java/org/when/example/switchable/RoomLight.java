package org.when.example.switchable;

/**
 * @author: when
 * @create: 2021-01-21  22:05
 **/
public class RoomLight extends BuildingLight implements Switchable {

    public RoomLight(int room) {
        super(room);
    }

    @Override
    public void powerUp() {
        System.out.println("Light in room " + room + " powered up.");
    }

    @Override
    public void powerDown() {
        System.out.println("Light in room " + room + " powered down.");
    }
}
