package org.when.example.switchable;

/**
 * @author: when
 * @create: 2021-01-21  22:27
 **/
public class ComputerMonitor extends Computer implements Switchable {
    public ComputerMonitor(int deskNumber) {
        super(deskNumber);
    }

    @Override
    public void powerUp() {
        System.out.println("Computer monitor on desk " + deskNumber + " powered up.");
    }

    @Override
    public void powerDown() {
        System.out.println("Computer monitor on desk " + deskNumber + " powered down.");
    }
}
